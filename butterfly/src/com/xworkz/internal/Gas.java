package com.xworkz.internal;



    public interface Gas {
        void ignite();
        void turnOff();
        void increaseFlame();
        void decreaseFlame();
        void checkLeakage();
        void refill();
        void connectCylinder();
        void disconnectCylinder();
        void monitorUsage();
    }

