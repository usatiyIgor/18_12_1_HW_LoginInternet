package com.example.den.a18_12_1_hw_logininternet;

/**
 * Created by Den on 1/13/2018.
 */

public class Auth {
   private String email, password;

    public Auth() {
    }

    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
