package internal;

import external.Snap;

    public class Snapchat extends Snap {
        public void share() {
            System.out.println("Snapchat: Shares the snap with friends.");
        }

        @Override
        public void capture() {
            System.out.println("Snapchat: Captures a snap with filters and effects.");
        }
    }

