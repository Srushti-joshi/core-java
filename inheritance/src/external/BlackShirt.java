package external;

import internal.Black;

    public class BlackShirt extends Black {
        public void style() {
            System.out.println("BlackShirt: Perfect for formal and casual wear.");
        }

        @Override
        public void color() {
            System.out.println("BlackShirt: Shirt color is black.");
        }
    }
