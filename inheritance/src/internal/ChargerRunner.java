package internal;

import external.FastCharger;

public class ChargerRunner {
        public static void main(String[] args) {
            Charger charger = new Charger();
            charger.chargeDevice();

            Charger fastCharger = new FastCharger();
            fastCharger.chargeDevice();

            FastCharger fc = new FastCharger();
            fc.chargeDevice();
            fc.quickCharge();
        }
    }


