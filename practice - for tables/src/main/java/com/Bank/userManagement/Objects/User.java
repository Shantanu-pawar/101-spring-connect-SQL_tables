package com.Bank.userManagement.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // this is for creation of attributes.

@Table(name = "user_information")
public class User {

    @Id // primary key
    @Column(name = "ID Number", unique = true)
    // by using unique = we can't copy those values
    // and Column is simply give us ability to change the columnName in our Table.
    private int rollNo;

    private String name;


    private int age;

    @Column(name = "Phone number")
    private String mobNo;

    public User(){}

    public User(int rollNo, String name, int age, String mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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
