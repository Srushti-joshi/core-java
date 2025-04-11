package external;

import internal.Bottle;
    public class WaterBottle extends Bottle {
        public void openCap() {
            System.out.println("WaterBottle: Cap can be opened for drinking.");
        }

        @Override
        public void fill() {
            System.out.println("WaterBottle: Filled with clean drinking water.");
        }
    }

