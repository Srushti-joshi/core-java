package external;

import internal.Bed;

public class KingSizeBed extends Bed {
        public void extraSpace() {
            System.out.println("KingSizeBed: Offering extra space for relaxation.");
        }

        @Override
        public void sleep() {
            System.out.println("KingSizeBed: Providing luxurious and spacious sleep.");
        }
    }


