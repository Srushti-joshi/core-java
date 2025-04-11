package external;

import internal.Charger;

public class FastCharger extends Charger {
        public void quickCharge() {
            System.out.println("FastCharger: Charging device rapidly.");
        }

        @Override
        public void chargeDevice() {
            System.out.println("FastCharger: Charging with fast-charging technology.");
        }
    }


