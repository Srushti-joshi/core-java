package com.xworkz.gold;

public class EarbudShop {
    Earbud earbud;

    public EarbudShop(Earbud earbud) {
        System.out.println("Constructor in EarbudShop");
        this.earbud = earbud;
    }

    public void sell() {
        System.out.println("Selling an earbud...");
        if (earbud != null) {
            earbud.playMusic();
        } else {
            System.out.println("No earbuds available");
        }
    }
}
