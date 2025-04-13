package external;

import internal.Mud;

    public class ClayMud extends Mud {
        public void makePottery() {
            System.out.println("ClayMud: Ideal for making pottery and bricks.");
        }

        @Override
        public void texture() {
            System.out.println("ClayMud: Smooth and sticky in texture.");
        }
    }
