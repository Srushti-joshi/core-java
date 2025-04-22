package com.xworkz.external;


import com.xworkz.internal.Fan;

public class CeilingFan implements Fan {

        @Override
        public void turnOn() {
            System.out.println("CeilingFan is turned on");
        }

        @Override
        public void turnOff() {
            System.out.println("CeilingFan is turned off");
        }

        @Override
        public void adjustSpeed(int speed) {
            System.out.println("CeilingFan speed is set to " + speed);
        }

        @Override
        public void oscillate(boolean shouldOscillate) {
            if (shouldOscillate) {
                System.out.println("CeilingFan is oscillating");
            } else {
                System.out.println("CeilingFan is not oscillating");
            }
        }

        @Override
        public void checkRotation() {
            System.out.println("CeilingFan rotation is normal");
        }
    }

