package com.xworkz.gold;

public class GoldRunner {
    public static void main(String[] args) {

        Gold gold=new Gold();
        GoldShop goldshop=new GoldShop(gold);
        goldshop.invoke();
    }
}

