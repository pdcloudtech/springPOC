package org.example.utilityService;

import org.example.customerEntities.CustomerProfile;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CrudServiceImpl implements CrudService {
    @Autowired
    private CustomerRepository repo;
    @Override
    //Save operation
    public CustomerProfile saveCustomerProfile(CustomerProfile cp){
        return repo.save(cp);
    }
    //read operation
    @Override
    public List<CustomerProfile> fetchCustomerProfileList(){
        List<CustomerProfile> customers = (List<CustomerProfile>) repo.findAll();
        return customers;
    }
    //update
    @Override
    public CustomerProfile updateCustomerProfile(CustomerProfile cp, String name){
        CustomerProfile customer =  repo.findById(name).get();

        if(Objects.nonNull(cp.getFname()) && !"".equalsIgnoreCase(cp.getFname())) {
            customer.setName(cp.getFname());
        }
        if(Objects.nonNull(cp.getSkill()) && !"".equalsIgnoreCase(cp.getSkill())) {
            customer.setName(cp.getSkill());
        }
        return repo.save(customer);
        }
    // delete
    @Override
    public void deleteCustomerProfileByName(String name){
        repo.deleteById(name);
    }
}
