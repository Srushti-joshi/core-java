package external;

import internal.Rubber;

public class EaserRubber extends Rubber {
        public void erase() {
            System.out.println("Eraser: Used to remove pencil marks.");
        }

        @Override
        public void stretch() {
            System.out.println("Eraser: Slightly flexible but designed for erasing.");
        }
    }


