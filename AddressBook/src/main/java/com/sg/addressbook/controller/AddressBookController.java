package com.sg.addressbook.controller;


import com.sg.addressbook.ui.UserIO;
import java.util.*;

public class AddressBookController {
    private UserIO io;
    private AddressBookDao dao;

    public AddressBookController(UserIO io, AddressBookDao dao) {
        this.io = io;
        this.dao = dao;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            printMenu();
            menuSelection = io.readInt("Please select the operation you wish to perform:", 1, 5);

            switch (menuSelection) {
                case 1:
                    addAddress();
                    break;
                case 2:
                    deleteAddress();
                    break;
                case 3:
                    findAddress();
                    break;
                case 4:
                    listAddressCount();
                    break;
                case 5:
                    listAllAddresses();
                    break;
                default:
                    keepGoing = false;
                    break;
            }
        }
        io.print("Goodbye!");
    }

    private void printMenu() {
        io.print("Menu");
        io.print("1. Add Address");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Addresses");
    }

    private void addAddress() {
        String firstName = io.readString("Please Enter First Name:");
        String lastName = io.readString("Please Enter Last Name:");
        String street = io.readString("Please Enter Street Address:");
        // Add more fields as necessary

        Address address = new Address(firstName, lastName, street);
        dao.addAddress(lastName, address);
        io.print("Address added. Press 1 to go to Main Menu.");
    }

    private void deleteAddress() {
        String lastName = io.readString("Please enter last name of address to delete:");
        Address address = dao.removeAddress(lastName);
        if (address != null) {
            io.print("Address Deleted. Press 1 to go to Main Menu.");
        } else {
            io.print("No such address. Press 1 to go to Main Menu.");
        }
    }

    private void findAddress() {
        String lastName = io.readString("Please enter last name of address to find:");
        Address address = dao.getAddress(lastName);
        if (address != null) {
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreet());
            // Print more fields as necessary
            io.print("Press 1 to go to Main Menu.");
        } else {
            io.print("No such address. Press 1 to go to Main Menu.");
        }
    }

    private void listAddressCount() {
        int count = dao.getAddressCount();
        io.print("There are " + count + " addresses in the book. Press 1 to go to Main Menu.");
    }

    private void listAllAddresses() {
        List<Address> addressList = dao.getAllAddresses();
        for (Address address : addressList) {
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreet());
            // Print more fields as necessary
            io.print("");
        }
        io.print("Press 1 to go to Main Menu.");
    }
}