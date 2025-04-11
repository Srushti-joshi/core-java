package internal;

import external.LuxuryHostel;

public class HostelRunner {
        public static void main(String[] args) {
            Hostel hostel = new Hostel();
            hostel.provideAccommodation();

            Hostel luxuryHostel = new LuxuryHostel();
            luxuryHostel.provideAccommodation();

            LuxuryHostel lh = new LuxuryHostel();
            lh.provideAccommodation();
            lh.provideAmenities();
        }
    }



