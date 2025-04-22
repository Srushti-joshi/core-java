package com.xworkz.runner;


import com.xworkz.external.Doorbell;
import com.xworkz.internal.Ring;

public class RingRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Ring ring = new Doorbell();
            ring.ringSound();
            ring.adjustVolume(5);
            ring.turnOff();

            System.out.println("\n=== Using Class Reference ===");
            Doorbell doorbell = new Doorbell();
            doorbell.ringSound();
            doorbell.adjustVolume(8);
            doorbell.turnOff();
        }
    }

