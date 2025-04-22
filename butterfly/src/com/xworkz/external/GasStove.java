package com.xworkz.external;


import com.xworkz.internal.Gas;

public class GasStove implements Gas {

        @Override
        public void ignite() {
            System.out.println("GasStove ignited");
        }

        @Override
        public void turnOff() {
            System.out.println("GasStove turned off");
        }

        @Override
        public void increaseFlame() {
            System.out.println("GasStove flame increased");
        }

        @Override
        public void decreaseFlame() {
            System.out.println("GasStove flame decreased");
        }

        @Override
        public void checkLeakage() {
            System.out.println("Checking for gas leakage");
        }

        @Override
        public void refill() {
            System.out.println("Gas cylinder refilled");
        }

        @Override
        public void connectCylinder() {
            System.out.println("Gas cylinder connected");
        }

        @Override
        public void disconnectCylinder() {
            System.out.println("Gas cylinder disconnected");
        }

        @Override
        public void monitorUsage() {
            System.out.println("Monitoring gas usage");
        }
    }
