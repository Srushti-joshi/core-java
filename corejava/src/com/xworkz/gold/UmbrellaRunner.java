package com.xworkz.gold;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella();
        UmbrellaShop shop = new UmbrellaShop(umbrella);
        shop.sell();
    }
}

