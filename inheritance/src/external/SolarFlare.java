package external;

import internal.Sun;

public class SolarFlare extends Sun {
        public void emitRadiation() {
            System.out.println("SolarFlare: Emitting intense radiation!");
        }

        @Override
        public void shine() {
            System.out.println("SolarFlare: Flashing with extreme brightness!");
        }
    }

