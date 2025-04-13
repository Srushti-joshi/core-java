package external;

import internal.Road;

    public class Highway extends Road {
        public void tollGate() {
            System.out.println("Highway: Has toll gates for access.");
        }

        @Override
        public void travel() {
            System.out.println("Highway: Allows fast and long-distance travel.");
        }
    }
