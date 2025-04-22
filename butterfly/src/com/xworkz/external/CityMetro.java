package com.xworkz.external;


import com.xworkz.internal.Metro;

public class CityMetro implements Metro {

        @Override
        public void startService() {
            System.out.println("City Metro service started");
        }

        @Override
        public void stopService() {
            System.out.println("City Metro service stopped");
        }

        @Override
        public void setRoute(String route) {
            System.out.println("City Metro route set to: " + route);
        }

        @Override
        public void openDoors() {
            System.out.println("City Metro doors opened");
        }

        @Override
        public void closeDoors() {
            System.out.println("City Metro doors closed");
        }

        @Override
        public void setSpeed(int speed) {
            System.out.println("City Metro speed set to " + speed + " km/h");
        }

        @Override
        public void announceArrival(String station) {
            System.out.println("City Metro arriving at " + station + " station");
        }

        @Override
        public void checkTicket() {
            System.out.println("Checking ticket in City Metro");
        }

        @Override
        public void checkPassengerCount() {
            System.out.println("Checking passenger count in City Metro");
        }
    }
