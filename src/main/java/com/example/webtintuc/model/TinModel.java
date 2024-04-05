package com.example.webtintuc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
@Document("tin")
public class TinModel {
    @Id
    private String id;
    @Field(name = "title")
    private String Title;
    @Field(name = "image")
    private String Image;
    @Field(name = "date")
    private String Date;
    @Field(name = "content")
    private String Content;
    @Field(name = "category")
    private TinCategory tinCategory;


    public TinModel(String id, String Title, String Date, String Content, TinCategory tinCategory, String Image){
        this.id = id;
        this.Title = Title;
        this.Date = Date;
        this.tinCategory = tinCategory;
        this.Content = Content;
        this.Image = Image;
    }


    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public TinCategory getTinCategory() {
        return tinCategory;
    }

    public void setTinCategory(TinCategory tinCategory) {
        this.tinCategory = tinCategory;
    }
    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}

