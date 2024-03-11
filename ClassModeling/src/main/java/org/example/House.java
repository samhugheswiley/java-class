package org.example;

public class House {

    private double latitude;
    private double longitude;
    private String address;
    private String houseName;

    // Constructor
    public House(double latitude, double longitude, String address, String houseName) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.houseName = houseName;
    }

    // Getters
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public String getHouseName() {
        return houseName;
    }

    // Setters
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}

