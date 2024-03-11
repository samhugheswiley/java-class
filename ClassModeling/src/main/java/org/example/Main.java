package org.example;



public class Main {
    public static void main(String[] args) {
        // Create a new House object
        House myHouse = new House(55.8642, -4.2518, "Glasgow, UK", "Sam's House");
        System.out.println(myHouse.getHouseName());

        // Create a new HouseXL object
        HouseXL myHouseXL = new HouseXL(55.8642, -4.2518, "Glasgow, UK", "Sam's 3D House", 10.0, 10.0, 10.0, 2);
        System.out.println(myHouseXL.getLatitude() + ", " + myHouseXL.getLongitude());

    }
}