package com.xworkz.runner;


import com.xworkz.external.Highway;
import com.xworkz.internal.Road;

public class RoadRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Road road = new Highway();
            road.drive();

            System.out.println("\n=== Using Class Reference ===");
            Highway highway = new Highway();
            highway.drive();
        }
    }

