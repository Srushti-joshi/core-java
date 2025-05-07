package com.xworkz.runner;


import com.xworkz.external.WallMirror;
import com.xworkz.internal.Mirror;

public class MirrorRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Mirror mirror = new WallMirror();
            mirror.reflect();

            System.out.println("\n=== Using Class Reference ===");
            WallMirror wallMirror = new WallMirror();
            wallMirror.reflect();
        }
    }
