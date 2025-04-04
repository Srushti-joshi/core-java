package com.xworkz.gold;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        EarthShop shop = new EarthShop(earth);
        shop.display();
    }
}
