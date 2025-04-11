package internal;

import external.WashingMachine;

public class MachineRunner {
        public static void main(String[] args) {
            Machine machine = new Machine();
            machine.start();

            Machine washingMachine = new WashingMachine();
            washingMachine.start();

            WashingMachine wm = new WashingMachine();
            wm.start();
            wm.washClothes();
        }
    }


