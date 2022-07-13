/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
 
public class Project {
    private int id;
    private String name;
    private String descr;
    private Date createdAt;
    private Date updatedAt;

    
    public Project(int id, String name, String descr, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.descr  = descr;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        
        
    
    }

     public Project() {
       //throw new UnsupportedOperationException("Not supported yet.");
       //Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getCreatedAt() {
        createdAt= new Date();
        return createdAt;
    }

    public void setCreatedAt(Date createAt) {
        this.createdAt = createAt;
    }

    public Date getUpdatedAt() {
        updatedAt= new Date();
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return this.name;
    }

   
}





