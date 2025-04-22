package com.xworkz.external;

import com.xworkz.internal.Laptop;

public class GamingLaptop implements Laptop {

        @Override
        public void powerOn() {
            System.out.println("GamingLaptop is powering on");
        }

        @Override
        public void powerOff() {
            System.out.println("GamingLaptop is shutting down");
        }

        @Override
        public void openLid() {
            System.out.println("Opening the GamingLaptop lid");
        }

        @Override
        public void closeLid() {
            System.out.println("Closing the GamingLaptop lid");
        }

        @Override
        public void chargeBattery() {
            System.out.println("Charging GamingLaptop battery");
        }

        @Override
        public void connectToWiFi() {
            System.out.println("GamingLaptop connected to WiFi");
        }

        @Override
        public void runDiagnostics() {
            System.out.println("Running diagnostics on GamingLaptop");
        }
    }
