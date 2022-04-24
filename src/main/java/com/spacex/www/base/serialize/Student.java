package com.spacex.www.base.serialize;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private transient String password;
    private Integer age;

    public Student() {
    }

    public Student(String name, String password, Integer age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
    public Student readObject(ObjectInputStream in){
        System.out.println("读Student对象");
        return null;
    }
    public void writeObject(ObjectOutputStream out){
        System.out.println("写Student对象");
    }
}
