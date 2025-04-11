package external;

import internal.Hindu;

    public class Devotee extends Hindu {
        public void visitTemple() {
            System.out.println("Devotee: Visits temple regularly for prayers.");
        }

        @Override
        public void worship() {
            System.out.println("Devotee: Offers prayers with devotion.");
        }
    }


