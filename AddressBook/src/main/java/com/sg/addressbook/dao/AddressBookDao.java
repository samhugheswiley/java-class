package com.sg.addressbook.dao;

import java.util.*;

public class AddressBookDao {
    private Map<String, Address> addresses = new HashMap<>();

    public Address addAddress(String lastName, Address address) {
        return addresses.put(lastName, address);
    }

    public Address removeAddress(String lastName) {
        return addresses.remove(lastName);
    }

    public Address getAddress(String lastName) {
        return addresses.get(lastName);
    }

    public List<Address> getAllAddresses() {
        return new ArrayList<>(addresses.values());
    }

    public int getAddressCount() {
        return addresses.size();
    }
}