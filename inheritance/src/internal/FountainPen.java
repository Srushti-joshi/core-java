package internal;

import external.Pen;


    public class FountainPen extends Pen {
        public void refill() {
            System.out.println("FountainPen: Refills ink from the ink bottle.");
        }

        @Override
        public void write() {
            System.out.println("FountainPen: Writes with a smooth flow of ink.");
        }
    }
