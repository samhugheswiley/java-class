package org.example.factorizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class factorize {
    private double latitude;
    private double longitude;
    private String address;
    private String houseName;

    // Constructor
    public factorize(double latitude, double longitude, String address, String houseName) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.houseName = houseName;
    }

    // Getters


    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }


    // Print factors list

    public void printFactors(List factors) {
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i) + " ");}
    }





    // Setters
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }






}
