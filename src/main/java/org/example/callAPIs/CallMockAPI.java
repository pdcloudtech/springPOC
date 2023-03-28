package org.example.callAPIs;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallMockAPI {
   // @RequestMapping("/api") need to define op, by default picks the get operation
    @GetMapping("/getAllCountries")// newer version of Springboot has concrete methods defined for each op
    public Object test() throws JsonProcessingException {
        String url = "https://api.first.org/data/v1/countries";
        RestTemplate RT = new RestTemplate();
        return null;
    }
    @GetMapping("/mockProfile")
    public String getProfiles(){
        String url = "http://pdcloudtech.com/allMockProfiles";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        //System.out.print(response);
        return response;
    }
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Spring") String name) throws JSONException, JsonProcessingException {
        ParseResponse profile = new ParseResponse();
        profile.processResponse();
        return String.format("Hello %s!!",name);

    }

    @GetMapping("/customerProfile")
    public String getCustomerProfile(){
        String url = "https://console.firebase.google.com/u/0/project/bco-sandbox-348413/firestore/data/~2FmockProfiles~2Fcustomer1";
        RestTemplate RT = new RestTemplate();
        String result = RT.getForObject(url,String.class);
        return result;
    }



}
