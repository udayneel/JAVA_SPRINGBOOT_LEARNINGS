package com.uday.learning.SpringMVC.model;

public class Student {

    String firstName;
    String lastName;

    String country;

    String favlanguage;
    public Student() {
    }

    public String getFavlanguage() {
        return favlanguage;
    }

    public void setFavlanguage(String favlanguage) {
        this.favlanguage = favlanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
