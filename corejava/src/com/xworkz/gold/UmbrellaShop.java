package com.xworkz.gold;

public class UmbrellaShop {
    Umbrella umbrella;

    public UmbrellaShop(Umbrella umbrella) {
        System.out.println("Constructor in UmbrellaShop");
        this.umbrella = umbrella;
    }

    public void sell() {
        System.out.println("Selling an umbrella...");
        if (umbrella != null) {
            umbrella.open();
        } else {
            System.out.println("No umbrellas available");
        }
    }
}
