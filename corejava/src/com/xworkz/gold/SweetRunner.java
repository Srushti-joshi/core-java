package com.xworkz.gold;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        SweetShop shop = new SweetShop(sweet);
        shop.serve();
    }
}


