package com.laffey.model;

public class Accountinfo {
    private Integer accountId;

    private Integer type;

    private String typeName;

    private Integer userId;

    public Accountinfo(Integer accountId, Integer type, String typeName, Integer userId) {
        this.accountId = accountId;
        this.type = type;
        this.typeName = typeName;
        this.userId = userId;
    }

    public Accountinfo() {
        super();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}