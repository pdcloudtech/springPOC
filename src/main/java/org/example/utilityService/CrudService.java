package org.example.utilityService;
import org.example.customerEntities.CustomerProfile;
import java.util.List;

public interface CrudService {
    //save
    CustomerProfile saveCustomerProfile(CustomerProfile cp);

    //Read
    List<CustomerProfile> fetchCustomerProfileList();

    //Update
    CustomerProfile updateCustomerProfile(CustomerProfile cp, String name);
    //Delete
    void deleteCustomerProfileByName(String name);
}
