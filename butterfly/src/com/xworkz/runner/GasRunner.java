package com.xworkz.runner;

import com.xworkz.external.GasStove;
import com.xworkz.internal.Gas;



    public class GasRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Gas gas = new GasStove();
            gas.connectCylinder();
            gas.ignite();
            gas.increaseFlame();
            gas.decreaseFlame();
            gas.monitorUsage();
            gas.checkLeakage();
            gas.turnOff();
            gas.disconnectCylinder();
            gas.refill();

            System.out.println("\n=== Using Class Reference ===");
            GasStove gasStove = new GasStove();
            gasStove.connectCylinder();
            gasStove.ignite();
            gasStove.increaseFlame();
            gasStove.decreaseFlame();
            gasStove.monitorUsage();
            gasStove.checkLeakage();
            gasStove.turnOff();
            gasStove.disconnectCylinder();
            gasStove.refill();
        }
    }
