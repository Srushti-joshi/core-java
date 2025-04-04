package com.xworkz.gold;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        EarbudShop shop = new EarbudShop(earbud);
        shop.sell();
    }
}
