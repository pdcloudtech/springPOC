package org.example.callAPIs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParseResponse{
    private CallMockAPI mockAPI;
    public void processResponse() throws JSONException {
        mockAPI = new CallMockAPI();
        String response = mockAPI.getProfiles();
        System.out.println("\n \nresponse from get call" +response);
        JSONArray arr = new JSONArray(response);
        System.out.println("\n \njson array "+ arr);
        List<CustomerProfile> cp = new ArrayList<CustomerProfile>() ;
        for(int i = 0; i< arr.length(); i++){
            System.out.println("\n \n \niterating "+ arr.get(i));
            JSONObject profile = arr.getJSONObject(i);
            CustomerProfile customer = new CustomerProfile();
            //customer.setName((String) profile.get("name"));
            //customer.setFname((String) profile.get("fname"));
            customer.setSkill((String) profile.get("skill"));
            cp.add(customer);
        }
        System.out.println("\n \n Customer 1"+cp.get(0));
    }
}
