package com.xworkz.gold;

public class SweetShop {
    Sweet sweet;

    public SweetShop(Sweet sweet) {
        System.out.println("Constructor in SweetShop");
        this.sweet = sweet;
    }

    public void serve() {
        System.out.println("Serving the sweet...");
        if (sweet != null) {
            sweet.taste();
        } else {
            System.out.println("No sweet available");
        }
    }

}
