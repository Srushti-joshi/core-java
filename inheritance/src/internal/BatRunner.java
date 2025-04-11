package internal;

import external.CricketBat;

public class BatRunner {
        public static void main(String[] args) {
            Bat bat = new Bat();
            bat.swing();

            Bat cricketBat = new CricketBat();
            cricketBat.swing();

            CricketBat cb = new CricketBat();
            cb.swing();
            cb.grip();
        }
    }


