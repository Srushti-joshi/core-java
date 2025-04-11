package external;

import internal.Leg;


    public class RoboticLeg extends Leg {
        public void advancedFeatures() {
            System.out.println("RoboticLeg: Has AI-powered movement capabilities.");
        }

        @Override
        public void walk() {
            System.out.println("RoboticLeg: Walks with mechanical precision.");
        }
    }
