package external;

import internal.Ear;
    public class HumanEar extends Ear {
        public void balance() {
            System.out.println("HumanEar: Helps in maintaining balance through the inner ear.");
        }

        @Override
        public void hear() {
            System.out.println("HumanEar: Hears a wide range of frequencies.");
        }
    }

