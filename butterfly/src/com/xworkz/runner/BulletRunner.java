package com.xworkz.runner;


import com.xworkz.external.RevolverBullet;
import com.xworkz.internal.Bullet;

public class BulletRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Bullet bullet = new RevolverBullet();
            bullet.fire();

            System.out.println("\n=== Using Class Reference ===");
            RevolverBullet revolverBullet = new RevolverBullet();
            revolverBullet.fire();
        }
    }

