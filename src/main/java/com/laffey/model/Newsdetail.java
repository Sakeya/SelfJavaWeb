package com.laffey.model;

public class Newsdetail {
    private Integer newsId;

    private String title;

    private String breif;

    private Integer groupId;

    private Integer kind;

    public Newsdetail(Integer newsId, String title, String breif, Integer groupId, Integer kind) {
        this.newsId = newsId;
        this.title = title;
        this.breif = breif;
        this.groupId = groupId;
        this.kind = kind;
    }

    public Newsdetail() {
        super();
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBreif() {
        return breif;
    }

    public void setBreif(String breif) {
        this.breif = breif == null ? null : breif.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }
}