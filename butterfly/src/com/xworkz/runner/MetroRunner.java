package com.xworkz.runner;

import com.xworkz.external.CityMetro;
import com.xworkz.internal.Metro;


    public class MetroRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Metro metro = new CityMetro();
            metro.startService();
            metro.setRoute("Red Line");
            metro.setSpeed(80);
            metro.announceArrival("Central Station");
            metro.openDoors();
            metro.checkTicket();
            metro.checkPassengerCount();
            metro.closeDoors();
            metro.stopService();

            System.out.println("\n=== Using Class Reference ===");
            CityMetro cityMetro = new CityMetro();
            cityMetro.startService();
            cityMetro.setRoute("Blue Line");
            cityMetro.setSpeed(60);
            cityMetro.announceArrival("Downtown Station");
            cityMetro.openDoors();
            cityMetro.checkTicket();
            cityMetro.checkPassengerCount();
            cityMetro.closeDoors();
            cityMetro.stopService();
        }
    }


