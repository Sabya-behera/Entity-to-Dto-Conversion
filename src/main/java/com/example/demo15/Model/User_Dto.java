package com.example.demo15.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User_Dto {

    @JsonIgnore  //IF value is to be ignored that is not to be shown in the response
    private int id = 0;
    @JsonProperty(value = "name")
    public String name = null;
    @JsonIgnore
    public int age;
    @JsonProperty(value = "salary")
    public int sal;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public User_Dto ()
    {
        this.name=name;
        this.id=id;
        this.age=age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
