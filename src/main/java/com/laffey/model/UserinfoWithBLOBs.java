package com.laffey.model;

public class UserinfoWithBLOBs extends Userinfo {
    private String avatar;

    private String age;

    public UserinfoWithBLOBs(Integer userId, String name, String description, Boolean gender, String avatar, String age) {
        super(userId, name, description, gender);
        this.avatar = avatar;
        this.age = age;
    }

    public UserinfoWithBLOBs() {
        super();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}