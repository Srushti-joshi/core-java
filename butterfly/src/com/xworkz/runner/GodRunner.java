package com.xworkz.runner;


import com.xworkz.external.Shiva;
import com.xworkz.internal.God;

    public class GodRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            God god = new Shiva();
            god.create();
            god.protect();
            god.destroy();
            god.bless();
            god.punish();
            god.forgive();
            god.listenPrayer();
            god.giveWisdom();
            god.showMiracle();

            System.out.println("\n=== Using Class Reference ===");
            Shiva shiva = new Shiva();
            shiva.create();
            shiva.protect();
            shiva.destroy();
            shiva.bless();
            shiva.punish();
            shiva.forgive();
            shiva.listenPrayer();
            shiva.giveWisdom();
            shiva.showMiracle();
        }
    }
