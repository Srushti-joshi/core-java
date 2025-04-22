package com.xworkz.external;

import com.xworkz.internal.Ring;

    public class Doorbell implements Ring {

        @Override
        public void ringSound() {
            System.out.println("Doorbell is ringing with a sound");
        }

        @Override
        public void adjustVolume(int level) {
            System.out.println("Adjusting doorbell volume to level: " + level);
        }

        @Override
        public void turnOff() {
            System.out.println("Turning off the doorbell");
        }
    }
