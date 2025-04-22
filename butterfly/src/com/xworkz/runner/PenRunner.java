package com.xworkz.runner;


import com.xworkz.external.GelPen;
import com.xworkz.internal.Pen;

public class PenRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Pen pen = new GelPen();
            pen.openCap();
            pen.write();
            pen.draw();
            pen.checkInkLevel();
            pen.refill();
            pen.changeNib();
            pen.closeCap();

            System.out.println("\n=== Using Class Reference ===");
            GelPen gelPen = new GelPen();
            gelPen.openCap();
            gelPen.write();
            gelPen.draw();
            gelPen.checkInkLevel();
            gelPen.refill();
            gelPen.changeNib();
            gelPen.closeCap();
        }
    }

