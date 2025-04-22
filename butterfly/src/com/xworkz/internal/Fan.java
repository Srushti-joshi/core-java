package com.xworkz.internal;


    public interface Fan {
        void turnOn();
        void turnOff();
        void adjustSpeed(int speed);
        void oscillate(boolean shouldOscillate);
        void checkRotation();
    }
