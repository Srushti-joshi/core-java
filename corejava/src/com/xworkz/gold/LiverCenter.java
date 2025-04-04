package com.xworkz.gold;

public class LiverCenter {
    Liver liver;

    public LiverCenter(Liver liver) {
        System.out.println("Constructor in LiverCenter");
        this.liver = liver;
    }

    public void checkFunction() {
        System.out.println("Checking liver function...");
        if (liver != null) {
            liver.detoxify();
        } else {
            System.out.println("No liver available");
        }
    }

}
