package com.xworkz.external;


import com.xworkz.internal.Train;

public class ExpressTrain implements Train {

        @Override
        public void start() {
            System.out.println("ExpressTrain is starting from the station");
        }

        @Override
        public void stop() {
            System.out.println("ExpressTrain is stopping at the next station");
        }

        @Override
        public void loadPassengers() {
            System.out.println("Loading passengers onto the ExpressTrain");
        }

        @Override
        public void announceStations() {
            System.out.println("Announcing upcoming stations on ExpressTrain");
        }

        @Override
        public void checkTickets() {
            System.out.println("Ticket checking in progress on ExpressTrain");
        }
    }
