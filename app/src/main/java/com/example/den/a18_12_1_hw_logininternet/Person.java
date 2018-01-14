package com.example.den.a18_12_1_hw_logininternet;

/**
 * Created by Den on 1/13/2018.
 */

public class Person {
    private String name, email, phone, description;

    public Person() {
    }

    public Person(String name, String email, String phone, String description) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.description = description;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
