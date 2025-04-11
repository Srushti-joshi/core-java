package external;

import internal.Moon;

public class FullMoon extends Moon {
        public void reflectLight() {
            System.out.println("FullMoon: Reflecting maximum sunlight.");
        }

        @Override
        public void glow() {
            System.out.println("FullMoon: Shining brightly with full glow.");
        }
    }

