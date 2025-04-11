package internal;

import external.SolarFlare;

public class SunRunner {
        public static void main(String[] args) {
            Sun sun = new Sun();
            sun.shine();

            System.out.println("-----------------");

            Sun solarFlare = new SolarFlare();
            solarFlare.shine();

            System.out.println("-----------------");

            SolarFlare sf = new SolarFlare();
            sf.shine();
            sf.emitRadiation();
        }
    }

