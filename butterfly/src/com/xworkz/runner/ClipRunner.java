package com.xworkz.runner;


import com.xworkz.external.HairClip;
import com.xworkz.internal.Clip;

public class ClipRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Clip clip = new Clip() {
                @Override
                public void hold() {

                }
            };
            clip.hold();

            System.out.println("\n=== Using Class Reference ===");
            HairClip hairClip = new HairClip();
            hairClip.hold();
        }
    }
