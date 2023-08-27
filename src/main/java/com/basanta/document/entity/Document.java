package com.basanta.document.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {

    @Id
    private Long document_id;

    private String type;

   private String document_name;

    public Long getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Long document_id) {
        this.document_id = document_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name;
    }
}
