package com.basanta.document.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user_document {

    @Id
    private Long user_document_id;

    private user user;

    private Document document;


    public Long getUser_document_id() {
        return user_document_id;
    }

    public void setUser_document_id(Long user_document_id) {
        this.user_document_id = user_document_id;
    }

    public com.basanta.document.entity.user getUser() {
        return user;
    }

    public void setUser(com.basanta.document.entity.user user) {
        this.user = user;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
