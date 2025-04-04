package com.xworkz.gold;

public class CigratteShop {
    Cigratte cigratte;

    public CigratteShop(Cigratte cigratte) {
        System.out.println("Constructor in CigratteShop");
        this.cigratte = cigratte;
    }

    public void sell() {
        System.out.println("Selling a cigratte...");
        if (cigratte != null) {
            cigratte.lightUp();
        } else {
            System.out.println("No cigrattes available");
        }
    }

}
