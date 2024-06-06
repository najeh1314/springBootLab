package com.nc.webapp.mdel;

import java.time.LocalDateTime;

public class Message {
    private String author;
    private LocalDateTime stampDate;
    private String message;

    public Message() {
        this.stampDate = LocalDateTime.now();
    }

    public Message(String author, String message) {
        this.stampDate = LocalDateTime.now();
        this.author = author;
        this.message = message;
    }

    public LocalDateTime getStampDate() {
        return stampDate;
    }

    public void setStampDate(LocalDateTime stampDate) {
        this.stampDate = stampDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
