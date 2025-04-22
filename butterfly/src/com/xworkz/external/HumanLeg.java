package com.xworkz.external;


import com.xworkz.internal.Leg;

public class HumanLeg implements Leg {

        @Override
        public void walk() {
            System.out.println("Human leg is walking");
        }

        @Override
        public void run() {
            System.out.println("Human leg is running");
        }

        @Override
        public void bend() {
            System.out.println("Human leg is bending");
        }
    }
