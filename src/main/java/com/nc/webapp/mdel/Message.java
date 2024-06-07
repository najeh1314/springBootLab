package com.nc.webapp.mdel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String author;
    private LocalDateTime stampDate;
    private String comment;

    // Constructeurs, getters, setters
    public Message() {}

    public Message(String author, String message, LocalDateTime stampDate) {
        this.author = author;
        this.stampDate = stampDate;
        this.comment = message;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getStampDate() {
        return stampDate;
    }

    public void setStampDate(LocalDateTime stampDate) {
        this.stampDate = stampDate;
    }

    public String getMessage() {
        return comment;
    }

    public void setMessage(String message) {
        this.comment = message;
    }
}
