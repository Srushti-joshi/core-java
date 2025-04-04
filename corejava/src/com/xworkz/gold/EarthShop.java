package com.xworkz.gold;

public class EarthShop {
    Earth earth;

    public EarthShop(Earth earth) {
        System.out.println("Constructor in EarthShop");
        this.earth = earth;
    }

    public void display() {
        System.out.println("Displaying Earth’s movement...");
        if (earth != null) {
            earth.rotate();
        } else {
            System.out.println("Earth object is missing");
        }
    }
}

