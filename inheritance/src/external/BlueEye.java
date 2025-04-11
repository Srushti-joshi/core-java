package external;

import internal.Eye;

    public class BlueEye extends Eye {
        public void eyeColor() {
            System.out.println("BlueEye: Has a distinct blue color.");
        }

        @Override
        public void see() {
            System.out.println("BlueEye: Sees the world with clarity and style.");
        }
    }

