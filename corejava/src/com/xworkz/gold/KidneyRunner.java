package com.xworkz.gold;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        KidneyCenter center = new KidneyCenter(kidney);
        center.checkFunction();
    }
}

