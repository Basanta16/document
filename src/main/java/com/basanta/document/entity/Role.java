package com.basanta.document.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {


    @Id
    private Long role_id;

    private String role;

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
