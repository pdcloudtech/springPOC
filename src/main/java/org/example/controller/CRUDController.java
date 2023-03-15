package org.example.controller;

import org.example.customerEntities.CustomerProfile;
import org.example.utilityService.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // make restful webservices
public class CRUDController {
    @Autowired private CrudService crudService;

    @PostMapping("/customers")
    public CustomerProfile saveCustomerProfile(
            @RequestBody CustomerProfile customerProfile){
        return crudService.saveCustomerProfile(customerProfile);
    }
    @GetMapping("/customers")
    public List<CustomerProfile> fetchCustomerProfileList(){
        return crudService.fetchCustomerProfileList();
    }
    @PutMapping("customers/{name}")
    public CustomerProfile updateCustomerProfile(@RequestBody CustomerProfile customerProfile,
                                                 @PathVariable("name") String name){
        return crudService.updateCustomerProfile(customerProfile, name);
    }
    @DeleteMapping("/customers/{name}")
    public String deleteCustomerProfileByName(@PathVariable("name") String name){
        crudService.deleteCustomerProfileByName(name);
        return "Deleted Successfully";
    }
}
