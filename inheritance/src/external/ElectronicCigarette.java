package external;

import internal.Cigarette;

public class ElectronicCigarette extends Cigarette {
        public void charge() {
            System.out.println("ElectronicCigarette: Charging the battery.");
        }

        @Override
        public void smoke() {
            System.out.println("ElectronicCigarette: Producing vapor instead of smoke.");
        }
}
