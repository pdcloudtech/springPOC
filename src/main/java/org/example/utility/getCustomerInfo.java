package org.example.utility;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class getCustomerInfo {
    @GetMapping("/getCustomerInfo")
    public String getCustomerProfile(){
        String url = "https://console.firebase.google.com/u/0/project/bco-sandbox-348413/firestore/data/~2FmockProfiles~2Fcustomer1";
        RestTemplate RT = new RestTemplate();
        String result = RT.getForObject(url,String.class);
        return result;
    }
}
