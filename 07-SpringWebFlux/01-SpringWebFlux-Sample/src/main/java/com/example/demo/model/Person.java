package com.example.demo.model;

public class Person {

    private Integer idPerson;
    private String name;

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Integer idPerson, String name) {
        this.idPerson = idPerson;
        this.name = name;
    }
}
