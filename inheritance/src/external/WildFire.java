package external;

import internal.Fire;

    public class WildFire extends Fire {
        public void spreadRapidly() {
            System.out.println("Wildfire: Spreading rapidly across the forest.");
        }

        @Override
        public void burn() {
            System.out.println("Wildfire: Burning uncontrollably with intense heat.");
        }

}
