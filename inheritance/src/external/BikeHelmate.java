package external;

import internal.Helmate;

public class BikeHelmate extends Helmate {
        public void visor() {
            System.out.println("BikeHelmet: Comes with a visor for eye protection.");
        }

        @Override
        public void protect() {
            System.out.println("BikeHelmet: Protects the rider’s head during a bike ride.");
        }
    }
