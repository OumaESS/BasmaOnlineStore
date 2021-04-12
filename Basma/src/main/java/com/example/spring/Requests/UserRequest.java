package com.example.spring.Requests;

public class UserRequest {

    private String firsteName;
    private String lasteName;
    private String email;
    private String password;

    public String getFirsteName() {
        return firsteName;
    }

    public void setFirsteName(String firsteName) {
        this.firsteName = firsteName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
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
