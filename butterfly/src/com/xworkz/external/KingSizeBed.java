package com.xworkz.external;


import com.xworkz.internal.Bed;

public class KingSizeBed implements Bed {

        @Override
        public void sleep() {
            System.out.println("Sleeping peacefully on KingSizeBed");
        }

        @Override
        public void makeBed() {
            System.out.println("Making the KingSizeBed neat and tidy");
        }

        @Override
        public void adjustHeight() {
            System.out.println("Adjusting the height of the KingSizeBed");
        }

        @Override
        public void adjustHeadrest() {
            System.out.println("Adjusting the headrest of the KingSizeBed");
        }

        @Override
        public void fold() {
            System.out.println("Folding the KingSizeBed");
        }

        @Override
        public void unfold() {
            System.out.println("Unfolding the KingSizeBed");
        }

        @Override
        public void checkComfortLevel() {
            System.out.println("Comfort level is excellent on KingSizeBed");
        }
    }

