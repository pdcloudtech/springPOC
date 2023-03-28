package org.example.callAPIs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.util.List;

public class ParseResponse{
    private CallMockAPI mockAPI;
    public void processResponse() throws JSONException, JsonProcessingException {
        mockAPI = new CallMockAPI();
        String response = mockAPI.getProfiles();
        System.out.println("\n \nresponse from get call" +response);
        ObjectMapper objectMapper = new ObjectMapper();
        // JSONArray arr = new JSONArray(response);
        //System.out.println("\n \njson array "+ arr);
        List<CustomerProfile> cp = objectMapper.readValue(response, new TypeReference<>(){}) ;
        /*for(int i = 0; i< arr.length(); i++){
            System.out.println("\n \n \niterating "+ arr.get(i));
            JSONObject profile = arr.getJSONObject(i);
            CustomerProfile customer = objectMapper.readValue(profile, CustomerProfile.class);
            //customer.setName((String) profile.get("name"));
            //customer.setFname((String) profile.get("fname"));
            customer.setSkill((String) profile.get("skill"));
            cp.add(customer);
        }*/
        System.out.println("\n \n Customer 1"+cp);
    }
}
