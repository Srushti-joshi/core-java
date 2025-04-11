package external;

import internal.Glass;

public class WineGlass extends Glass {
        public void swirl() {
            System.out.println("WineGlass: Swirling wine for aeration.");
        }

        @Override
        public void fill() {
            System.out.println("WineGlass: Pouring wine into the glass.");
        }
    }
