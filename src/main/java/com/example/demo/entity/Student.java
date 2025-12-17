package com.example.demo.entity;
import java.time.LocalDate;


public class Student{
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
}