package com.xworkz.gold;

public class KidneyCenter {
    Kidney kidney;

    public KidneyCenter(Kidney kidney) {
        System.out.println("Constructor in KidneyCenter");
        this.kidney = kidney;
    }

    public void checkFunction() {
        System.out.println("Checking kidney function...");
        if (kidney != null) {
            kidney.filterBlood();
        } else {
            System.out.println("No kidney available");
        }
    }

}
