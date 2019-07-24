package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;

    private String adminName;
    private String adminDesignation;
    private String adminEmail;

    private String password;

    public  Admin(){

    }


    public Admin(String adminName, String adminDesignation, String adminEmail, String password , int adminId) {
        super();
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminDesignation = adminDesignation;
        this.adminEmail = adminEmail;
        this.password = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminDesignation() {
        return adminDesignation;
    }

    public void setAdminDesignation(String adminDesignation) {
        this.adminDesignation = adminDesignation;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
