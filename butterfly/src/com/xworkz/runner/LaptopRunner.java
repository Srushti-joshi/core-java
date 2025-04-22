package com.xworkz.runner;

import com.xworkz.external.GamingLaptop;
import com.xworkz.internal.Laptop;


    public class LaptopRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Laptop laptop = new GamingLaptop();
            laptop.openLid();
            laptop.powerOn();
            laptop.connectToWiFi();
            laptop.chargeBattery();
            laptop.runDiagnostics();
            laptop.powerOff();
            laptop.closeLid();

            System.out.println("\n=== Using Class Reference ===");
            GamingLaptop gamingLaptop = new GamingLaptop();
            gamingLaptop.openLid();
            gamingLaptop.powerOn();
            gamingLaptop.connectToWiFi();
            gamingLaptop.chargeBattery();
            gamingLaptop.runDiagnostics();
            gamingLaptop.powerOff();
            gamingLaptop.closeLid();
        }
    }
