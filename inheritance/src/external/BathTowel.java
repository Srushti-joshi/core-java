package external;

import internal.Towel;

public class BathTowel extends Towel {
        public void softTexture() {
            System.out.println("BathTowel: Soft and comfortable texture.");
        }

        @Override
        public void dry() {
            System.out.println("BathTowel: Drying body quickly and efficiently.");
        }
    }


