package org.example;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;
import java.util.Arrays;

@RestController
public class CallMockAPI {
    @GetMapping("/mockProfile")
    public String getProfiles(){
        String url = "http://pdcloudtech.com/allMockProfiles";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Spring") String name){
        return String.format("Hello %s!!",name);

    }

    @GetMapping("/customerProfile")
    public String getCustomerProfile(){
        String url = "https://console.firebase.google.com/u/0/project/bco-sandbox-348413/firestore/data/~2FmockProfiles~2Fcustomer1";
        RestTemplate RT = new RestTemplate();
        String result = RT.getForObject(url,String.class);
        return result;
    }

    @GetMapping("/test")
    public String test(){
        String url = "https://api.first.org/data/v1/countries";
        RestTemplate RT = new RestTemplate();
        String test2 = RT.getForObject(url,String.class);
        return test2;
    }
}
