package external;

import internal.Shirt;

public class FormalShirt extends Shirt {
        public void iron() {
            System.out.println("FormalShirt: Needs to be properly ironed for a crisp look.");
        }

        @Override
        public void wear() {
            System.out.println("FormalShirt: Suitable for office and formal occasions.");
        }
    }


