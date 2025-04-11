package external;

import internal.Bat;

public class CricketBat extends Bat {
        public void grip() {
            System.out.println("CricketBat: Has a rubber grip for better handling.");
        }

        @Override
        public void swing() {
            System.out.println("CricketBat: Used to hit a cricket ball.");
        }
    }
