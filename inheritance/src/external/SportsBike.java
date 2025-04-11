package external;

import internal.Bike;

public class SportsBike extends Bike {
        public void turboBoost() {
            System.out.println("SportsBike: Activating turbo boost!");
        }

        @Override
        public void ride() {
            System.out.println("SportsBike: Riding at high speed!");
        }
    }



