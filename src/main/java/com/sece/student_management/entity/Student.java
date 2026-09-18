package com.sece.student_management.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //tells JPA that studetns is a db entity
@Table(name = "students")
//specifies that the db table should be called students

public class Student {
    @Id //marks id as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //tells the JPA db to generate the ID automaticlly

    private Long id;
    private String name;
    private String email;
    private String department;
    //JPA needs a no argument constructor to creeat the entity object
    public Student() {
    }
    public Student (String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    



}