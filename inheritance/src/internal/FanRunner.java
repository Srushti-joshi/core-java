package internal;

import external.CeilingFan;

public class FanRunner {
        public static void main(String[] args) {
            Fan fan = new Fan();

            Fan ceilingFan = new CeilingFan();


            CeilingFan cf = new CeilingFan();
            cf.rotate();
            cf.adjustSpeed();
        }
    }


