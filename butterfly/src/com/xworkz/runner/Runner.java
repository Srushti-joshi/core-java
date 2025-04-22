package com.xworkz.runner;
import com.xworkz.external.*;
import com.xworkz.*;
import com.xworkz.internal.Car;

public class Runner {

        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Car car = new Sedan();
            car.start();
            car.setSpeed(60);
            car.turn("left");
            car.playMusic("Highway Tune");
            car.enableGPS();
            car.openSunroof();
            car.accelerate();
            car.brake();
            car.stop();

            System.out.println("\n=== Using Class Reference ===");
            Sedan sedan = new Sedan();
            sedan.start();
            sedan.setSpeed(80);
            sedan.turn("right");
            sedan.playMusic("Night Drive");
            sedan.enableGPS();
            sedan.openSunroof();
            sedan.accelerate();
            sedan.brake();
            sedan.stop();
        }
    }



