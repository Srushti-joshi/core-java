package com.xworkz.runner;

import com.xworkz.external.CasualTop;
import com.xworkz.internal.Top;





    public class TopRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Top top = new CasualTop();
            top.wear();
            top.wash();
            top.fold();
            top.iron();
            top.getSize();

            System.out.println("\n=== Using Class Reference ===");
            CasualTop casualTop = new CasualTop();
            casualTop.wear();
            casualTop.wash();
            casualTop.fold();
            casualTop.iron();
            casualTop.getSize();
        }
    }
