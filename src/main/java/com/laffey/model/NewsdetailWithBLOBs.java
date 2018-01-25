package com.laffey.model;

public class NewsdetailWithBLOBs extends Newsdetail {
    private String content;

    private String images;

    public NewsdetailWithBLOBs(Integer newsId, String title, String breif, Integer groupId, Integer kind, String content, String images) {
        super(newsId, title, breif, groupId, kind);
        this.content = content;
        this.images = images;
    }

    public NewsdetailWithBLOBs() {
        super();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}