package external;

import internal.Machine;

    public class WashingMachine extends Machine {
        public void washClothes() {
            System.out.println("WashingMachine: Washing clothes.");
        }

        @Override
        public void start() {
            System.out.println("WashingMachine: Starting wash cycle.");
        }
    }

