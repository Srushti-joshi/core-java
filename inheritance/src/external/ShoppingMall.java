package external;

import internal.Mall;

    public class ShoppingMall extends Mall {
        public void entertainment() {
            System.out.println("ShoppingMall: Offers movie theaters, arcades, and food courts.");
        }

        @Override
        public void visit() {
            System.out.println("ShoppingMall: Visit for shopping, dining, and entertainment.");
        }
    }
