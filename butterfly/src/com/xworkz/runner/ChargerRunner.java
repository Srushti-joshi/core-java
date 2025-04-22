package com.xworkz.runner;

import com.xworkz.external.MobileCharger;
import com.xworkz.internal.Charger;


    public class ChargerRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Charger charger = new MobileCharger();
            charger.plugIn();
            charger.chargeDevice(50);
            charger.checkStatus();
            charger.overchargeProtection();
            charger.plugOut();

            System.out.println("\n=== Using Class Reference ===");
            MobileCharger mobileCharger = new MobileCharger();
            mobileCharger.plugIn();
            mobileCharger.chargeDevice(100);
            mobileCharger.checkStatus();
            mobileCharger.overchargeProtection();
            mobileCharger.plugOut();
        }
    }
