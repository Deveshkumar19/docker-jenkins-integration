package com.devesh.springdockerjenkins.model;

public class Book {

    private String bookName;

    private String AuthorName;

    private int cost;

    public Book(String bookName, String authorName, int cost) {
        this.bookName = bookName;
        AuthorName = authorName;
        this.cost = cost;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public Book setAuthorName(String authorName) {
        AuthorName = authorName;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public Book setCost(int cost) {
        this.cost = cost;
        return this;
    }
}
