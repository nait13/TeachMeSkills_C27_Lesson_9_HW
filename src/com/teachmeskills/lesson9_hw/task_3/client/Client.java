package com.teachmeskills.lesson9_hw.task_3.client;

import com.teachmeskills.lesson9_hw.task_3.card.BaseCard;

/**
 * This is a class for creating a Client instance
 */
public class Client {
    private String name;
    private String surName;
    private String passportNumber;
    private String birthDate;
    private String postcode;
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private BaseCard[] cards;

    public Client(String name,
                  String surName,
                  String passportNumber,
                  String birthDate,
                  String postcode,
                  String country,
                  String city,
                  String street,
                  String houseNumber,
                  BaseCard[] cards) {
        this.name = name;
        this.surName = surName;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
        this.postcode = postcode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.cards = cards;
    }
    public void showInformationClient(){
        System.out.println(
                getName() + " " + getSurName() + "\n" + "Карт в наличие: " + showCardLength()
        );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int showCardLength(){
        return getCards().length;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }
}
