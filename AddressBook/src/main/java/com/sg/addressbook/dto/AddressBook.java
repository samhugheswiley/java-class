package com.sg.addressbook.dto;

public class AddressBook {
    private String firstName;
    private String lastName;
    private String street;

    public AddressBook(String firstName, String lastName, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }
}