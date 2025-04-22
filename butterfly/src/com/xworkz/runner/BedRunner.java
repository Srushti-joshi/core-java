package com.xworkz.runner;


import com.xworkz.external.KingSizeBed;
import com.xworkz.internal.Bed;

public class BedRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Bed bed = new KingSizeBed();
            bed.makeBed();
            bed.sleep();
            bed.adjustHeight();
            bed.adjustHeadrest();
            bed.checkComfortLevel();
            bed.fold();
            bed.unfold();

            System.out.println("\n=== Using Class Reference ===");
            KingSizeBed kingSizeBed = new KingSizeBed();
            kingSizeBed.makeBed();
            kingSizeBed.sleep();
            kingSizeBed.adjustHeight();
            kingSizeBed.adjustHeadrest();
            kingSizeBed.checkComfortLevel();
            kingSizeBed.fold();
            kingSizeBed.unfold();
        }
    }
