package com.springboot.crud.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="book")
public class Book {

    // Fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="isbn")
    private String isbn;

    @Column(name="price")
    private BigDecimal price;

    // Constructors
    public Book() {}

    public Book(String title, String author, String isbn, BigDecimal price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Getters & Setters
    // Id
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // Author
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    // ISBN
    public String getISBN(String isbn) { return isbn; }
    public void setISBN() { this.isbn = isbn; }

    // Price
    public BigDecimal getPrice() { return price; }
    public void setPrice() { this.price = price; }

    // toString()
    public String toString() {
        return "Book: [Id: "+ id + ", Title: " + title + ", Author: " + author + ", Price: " + price  +"]";
    }
}
