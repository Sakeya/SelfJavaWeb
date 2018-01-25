package com.laffey.model;

public class Userinfo {
    private Integer userId;

    private String name;

    private String description;

    private Boolean gender;

    public Userinfo(Integer userId, String name, String description, Boolean gender) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.gender = gender;
    }

    public Userinfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}