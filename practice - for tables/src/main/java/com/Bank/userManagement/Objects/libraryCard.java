package com.Bank.userManagement.Objects;


import jakarta.persistence.*;

@Entity
@Table(name = "library card")
public class libraryCard {

    @Id
    @Column(unique=true)
    private int cardNumber;

    @Column(name="StudentName")
    private String name;
    private String bookName;

    @OneToOne  //one to one mappings between the two entities.
    @JoinColumn // means add a foreign key column

    libraryCard(){}


    public libraryCard(int cardNumber, String name, String bookName) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.bookName = bookName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}


