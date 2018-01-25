package com.laffey.model;

public class Newsgroup {
    private Integer groupId;

    private String title;

    private String brief;

    private Integer type;

    public Newsgroup(Integer groupId, String title, String brief, Integer type) {
        this.groupId = groupId;
        this.title = title;
        this.brief = brief;
        this.type = type;
    }

    public Newsgroup() {
        super();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}