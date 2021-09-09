package com.example.demo15.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User_Dto {

    @JsonIgnore  //IF value is to be ignored that is not to be shown in the response
    private int id=0;
    @JsonProperty(value = "name")
    public  String name=null;
    public  String mail;
    @JsonIgnore
    public  int age;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
