package external;

import internal.Hostel;

    public class LuxuryHostel extends Hostel {
        public void provideAmenities() {
            System.out.println("LuxuryHostel: Providing Wi-Fi, gym, and premium meals.");
        }

        @Override
        public void provideAccommodation() {
            System.out.println("LuxuryHostel: Providing comfortable and spacious rooms.");
        }
    }


