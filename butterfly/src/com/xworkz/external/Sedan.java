package com.xworkz.external;


import com.xworkz.internal.Car;

public class Sedan implements Car {

        @Override
        public void start() {
            System.out.println("Sedan started");
        }

        @Override
        public void stop() {
            System.out.println("Sedan stopped");
        }

        @Override
        public void accelerate() {
            System.out.println("Sedan is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Sedan is braking");
        }

        @Override
        public void turn(String direction) {
            System.out.println("Sedan is turning " + direction);
        }

        @Override
        public void setSpeed(int speed) {
            System.out.println("Sedan speed set to " + speed + " km/h");
        }

        @Override
        public void playMusic(String track) {
            System.out.println("Playing music: " + track);
        }

        @Override
        public void openSunroof() {
            System.out.println("Sedan sunroof opened");
        }

        @Override
        public void enableGPS() {
            System.out.println("GPS enabled in Sedan");
        }
    }


