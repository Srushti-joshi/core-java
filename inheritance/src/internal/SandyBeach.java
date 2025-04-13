package internal;

import external.Beach;

    public class SandyBeach extends Beach {
        public void play() {
            System.out.println("SandyBeach: Play beach volleyball or build sandcastles.");
        }

        @Override
        public void relax() {
            System.out.println("SandyBeach: Relax by the ocean with soft sand under your feet.");
        }
    }
