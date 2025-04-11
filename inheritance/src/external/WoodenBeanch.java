package external;

import internal.Beanch;

public class WoodenBeanch extends Beanch {
        public void polish() {
            System.out.println("WoodenBench: Applying polish to protect the wood.");
        }

        @Override
        public void sit() {
            System.out.println("WoodenBench: Comfortable wooden seating.");
        }
    }


