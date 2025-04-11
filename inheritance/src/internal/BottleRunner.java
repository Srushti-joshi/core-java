package internal;

import external.WaterBottle;

public class BottleRunner {
        public static void main(String[] args) {
            Bottle bottle = new Bottle();
            bottle.fill();

            Bottle waterBottle = new WaterBottle();
            waterBottle.fill();

            WaterBottle wb = new WaterBottle();
            wb.fill();
            wb.openCap();
        }
    }


