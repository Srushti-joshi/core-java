package external;

import internal.Pg;

public class LuxuryPg extends Pg {
        public void provideFood() {
            System.out.println("LuxuryPG: Providing premium meals.");
        }

        @Override
        public void provideAccommodation() {
            System.out.println("LuxuryPG: Providing luxury accommodation with extra facilities.");
        }
    }


