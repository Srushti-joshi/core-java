package internal;

import external.ElectricBus;

public class BusRunner {
        public static void main(String[] args) {
            Bus bus = new Bus();
            bus.drive();

            Bus electricBus = new ElectricBus();
            electricBus.drive();

            ElectricBus eb = new ElectricBus();
            eb.drive();
            eb.chargeBattery();
        }
    }


