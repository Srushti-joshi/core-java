package external;

import internal.Swim;

    public class Fish extends Swim {
        public void breatheUnderwater() {
            System.out.println("Fish: Can breathe underwater using gills.");
        }

        @Override
        public void move() {
            System.out.println("Fish: Swims gracefully in water.");
        }

}
