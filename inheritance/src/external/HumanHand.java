package external;

import internal.Hand;

    public class HumanHand extends Hand {
        public void grip() {
            System.out.println("HumanHand: Can grip and hold objects.");
        }

        @Override
        public void move() {
            System.out.println("HumanHand: Moves with fine motor skills for precise actions.");
        }
    }
