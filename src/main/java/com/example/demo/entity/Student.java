package com.example.demo.entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
@Entity
public class Student{
    @Id
    private long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    
    public long getID(){
        return id;
    }
    public void setID(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDept(){
        return id;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public LocalDate detDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa = cgpa;
    }
}