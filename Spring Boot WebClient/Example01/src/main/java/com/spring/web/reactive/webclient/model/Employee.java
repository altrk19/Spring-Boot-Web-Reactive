package com.spring.web.reactive.webclient.model;

import java.time.LocalDate;


public class Employee {
    private String id;
    private String name;
    private String lastname;
    private LocalDate birthDate;

    public Employee() {
    }

    public Employee(String id, String name, String lastname, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}