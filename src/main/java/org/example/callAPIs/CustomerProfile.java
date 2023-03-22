package org.example.callAPIs;

import java.util.List;

public class CustomerProfile {
    private String name;
    private String fname;
    private String skill;
    private List<String> phoneNumbers;

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "CustomerProfile{" +
                "name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", skill='" + skill + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
