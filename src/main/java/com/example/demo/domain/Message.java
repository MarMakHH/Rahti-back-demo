package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageid;

    private String content;

    public Message() {
    }

    public Message(String content) {
        this.content = content;
    }

    public Long getMessageid() {
        return this.messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message [messageid=" + messageid + ", content=" + content + "]";
    }

}
