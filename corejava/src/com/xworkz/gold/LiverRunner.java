package com.xworkz.gold;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        LiverCenter center = new LiverCenter(liver);
        center.checkFunction();
    }

}
