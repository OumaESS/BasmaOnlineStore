package com.example.spring.Responses;

public class UserResponse {

    private String userId;
    private String firsteName;
    private String lasteName;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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
}
