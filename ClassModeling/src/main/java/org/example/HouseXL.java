package org.example;

public class HouseXL {
    private double latitude;
    private double longitude;
    private String address;
    private String houseName;
    private double width;
    private double height;
    private double depth;
    private int numberOfFloors;

    // Constructor
    public HouseXL(double latitude, double longitude, String address, String houseName, double width, double height, double depth, int numberOfFloors) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.houseName = houseName;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.numberOfFloors = numberOfFloors;
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

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
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

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
