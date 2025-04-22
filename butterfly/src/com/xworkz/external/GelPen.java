package com.xworkz.external;


import com.xworkz.internal.Pen;

public class GelPen implements Pen {

        @Override
        public void write() {
            System.out.println("Writing smoothly with GelPen");
        }

        @Override
        public void draw() {
            System.out.println("Drawing using GelPen");
        }

        @Override
        public void refill() {
            System.out.println("Refilling the GelPen");
        }

        @Override
        public void openCap() {
            System.out.println("Opening the GelPen cap");
        }

        @Override
        public void closeCap() {
            System.out.println("Closing the GelPen cap");
        }

        @Override
        public void checkInkLevel() {
            System.out.println("Ink level is sufficient in GelPen");
        }

        @Override
        public void changeNib() {
            System.out.println("Changing the nib of GelPen");
        }
    }

