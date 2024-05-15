package com.hexa.hexagonal.application.core.domain;

public class Address {
    private String street;
    private String number;
    private String district;
    private String country;
    private String state;
    private String zipCode;

    public Address(String zipCode){

        this.zipCode = zipCode;
    }

    public Address(String street, String number, String district, String country, String state, String zipCode) {
        this.street = street;
        this.number = number;
        this.district = district;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
