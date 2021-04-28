package com.javadrools.model;

public class Publication {

   // private Author author;
    private String type;
    private String author;
    private int discount;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public enum Author {
        WK,
        ELSIEVER,
        APA
    }

}