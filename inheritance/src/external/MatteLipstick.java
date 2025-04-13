package external;

import internal.Lipstick;

    public class MatteLipstick extends Lipstick {
        public void longLasting() {
            System.out.println("MatteLipstick: Stays on for hours without smudging.");
        }

        @Override
        public void apply() {
            System.out.println("MatteLipstick: Applies with a smooth, matte finish.");
        }
    }
