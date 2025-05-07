package com.xworkz.external;


import com.xworkz.internal.Bullet;

public class RevolverBullet implements Bullet {

        @Override
        public void fire() {
            System.out.println("Revolver bullet fired!");
        }
    }
