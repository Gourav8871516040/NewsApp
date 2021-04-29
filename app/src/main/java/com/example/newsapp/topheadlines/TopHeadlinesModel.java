package com.example.newsapp.topheadlines;

import android.os.Parcelable;

import java.io.Serializable;

public class TopHeadlinesModel implements Serializable {

    String title  , desc , source , author, url , urltoimage , content;

    public TopHeadlinesModel(String title, String desc, String source, String author, String url, String urltoimage, String content) {
        this.title = title;
        this.desc = desc;
        this.source = source;
        this.author = author;
        this.url = url;
        this.urltoimage = urltoimage;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUrltoimage(String urltoimage) {
        this.urltoimage = urltoimage;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public TopHeadlinesModel() {
    }

    public String getUrl() {
        return url;
    }

    public String getUrltoimage() {
        return urltoimage;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getSource() {
        return source;
    }

}
