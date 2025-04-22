package com.xworkz.external;

import com.xworkz.internal.Charger;


    public class MobileCharger implements Charger {

        @Override
        public void plugIn() {
            System.out.println("Mobile charger is plugged in.");
        }

        @Override
        public void plugOut() {
            System.out.println("Mobile charger is unplugged.");
        }

        @Override
        public void chargeDevice(int percentage) {
            System.out.println("Charging device to " + percentage + "%");
        }

        @Override
        public void checkStatus() {
            System.out.println("Mobile charger is working fine.");
        }

        @Override
        public void overchargeProtection() {
            System.out.println("Overcharge protection is activated.");
        }
    }
