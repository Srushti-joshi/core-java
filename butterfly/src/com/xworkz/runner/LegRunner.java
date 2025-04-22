package com.xworkz.runner;


import com.xworkz.external.HumanLeg;
import com.xworkz.internal.Leg;

public class LegRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Leg leg = new HumanLeg();
            leg.walk();
            leg.run();
            leg.bend();

            System.out.println("\n=== Using Class Reference ===");
            HumanLeg humanLeg = new HumanLeg();
            humanLeg.walk();
            humanLeg.run();
            humanLeg.bend();
        }
    }
