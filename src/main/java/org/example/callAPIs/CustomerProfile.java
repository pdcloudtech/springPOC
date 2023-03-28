package org.example.callAPIs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(value ={"phoneNumbers"
        })
public class CustomerProfile {
    private String name;
    private String firstName;
    private String fname;
    private String skill;
    private String phoneNumber;
    private List<String> phoneNumbers;
    private String id;
    private String lastName;

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "CustomerProfile{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fname='" + fname + '\'' +
                ", skill='" + skill + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
