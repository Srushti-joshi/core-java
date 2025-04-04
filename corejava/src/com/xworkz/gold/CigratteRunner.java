package com.xworkz.gold;

public class CigratteRunner {
    public static void main(String[] args) {
        Cigratte cigratte = new Cigratte();
        CigratteShop shop = new CigratteShop(cigratte);
        shop.sell();
    }

}
