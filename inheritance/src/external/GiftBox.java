package external;

import internal.Box;

public class GiftBox extends Box {
        public void wrap() {
            System.out.println("GiftBox: Wrapping the box with decorative paper.");
        }

        @Override
        public void open() {
            System.out.println("GiftBox: Opening a beautifully wrapped gift box.");
        }
    }


