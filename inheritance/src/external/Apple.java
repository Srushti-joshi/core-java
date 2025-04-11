package external;

import internal.Fruit;

    public class Apple extends Fruit {
        public void color() {
            System.out.println("Apple: Typically red, green, or yellow.");
        }

        @Override
        public void taste() {
            System.out.println("Apple: Sweet and sometimes slightly tart.");
        }
    }


