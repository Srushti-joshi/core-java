package com.xworkz.runner;


import com.xworkz.external.CeilingFan;
import com.xworkz.internal.Fan;

public class FanRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Fan fan = new CeilingFan();
            fan.turnOn();
            fan.adjustSpeed(3);
            fan.oscillate(true);
            fan.checkRotation();
            fan.turnOff();

            System.out.println("\n=== Using Class Reference ===");
            CeilingFan ceilingFan = new CeilingFan();
            ceilingFan.turnOn();
            ceilingFan.adjustSpeed(2);
            ceilingFan.oscillate(false);
            ceilingFan.checkRotation();
            ceilingFan.turnOff();
        }
    }
