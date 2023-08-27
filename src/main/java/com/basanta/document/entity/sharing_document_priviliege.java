package com.basanta.document.entity;


import javax.persistence.Entity;

@Entity
public class sharing_document_priviliege {

    private Long sdp_id;

    private user user;

    private String privilege;


    public Long getSdp_id() {
        return sdp_id;
    }

    public void setSdp_id(Long sdp_id) {
        this.sdp_id = sdp_id;
    }

    public com.basanta.document.entity.user getUser() {
        return user;
    }

    public void setUser(com.basanta.document.entity.user user) {
        this.user = user;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
}
