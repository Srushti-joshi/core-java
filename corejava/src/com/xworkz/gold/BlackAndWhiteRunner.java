package com.xworkz.gold;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        BlackAndWhite bw = new BlackAndWhite();
        BlackAndWhiteShop shop = new BlackAndWhiteShop(bw);
        shop.showTheme();
    }

}
