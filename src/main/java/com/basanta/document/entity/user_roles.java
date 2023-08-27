package com.basanta.document.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user_roles {

    @Id
    private Long user_role_id;

    private user user;

    private Document document;

    public Long getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Long user_role_id) {
        this.user_role_id = user_role_id;
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
