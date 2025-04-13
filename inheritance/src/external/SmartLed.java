package external;

import internal.Led;

public class SmartLed extends Led {
        public void changeColor() {
            System.out.println("SmartLed: Can change colors via remote or app.");
        }

        @Override
        public void glow() {
            System.out.println("SmartLed: Glows with adjustable brightness and color.");
        }
    }
