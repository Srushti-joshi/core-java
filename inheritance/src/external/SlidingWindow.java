package external;

import internal.Window;

    public class SlidingWindow extends Window {
        public void slide() {
            System.out.println("SlidingWindow: Slides horizontally for easy opening.");
        }

        @Override
        public void open() {
            System.out.println("SlidingWindow: Opens by sliding smoothly to the side.");
        }
    }
