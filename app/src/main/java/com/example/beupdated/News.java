package com.example.beupdated;

public class News {

    private String title;
    private String section;
    private String author;
    private String date;
    private String url;
    private String thumbnail;
    private String trailText;

    public News(String title, String section, String author, String date, String url, String thumbnail, String trailText) {
        this.title = title;
        this.section = section;
        this.author = author;
        this.date = date;
        this.url = url;
        this.thumbnail = thumbnail;
        this.trailText = trailText;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTrailTextHtml() {
        return trailText;
    }
}
