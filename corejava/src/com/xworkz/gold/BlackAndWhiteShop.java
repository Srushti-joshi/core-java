package com.xworkz.gold;

public class BlackAndWhiteShop {
    BlackAndWhite bw;

    public BlackAndWhiteShop(BlackAndWhite bw) {
        System.out.println("Constructor in BlackAndWhiteShop");
        this.bw = bw;
    }

    public void showTheme() {
        System.out.println("Displaying the theme...");
        if (bw != null) {
            bw.display();
        } else {
            System.out.println("No theme available");
        }
    }

}
