package external;

import internal.Train;

    public class BulletTrain extends Train {
        public void highSpeed() {
            System.out.println("BulletTrain: Travels at extremely high speed.");
        }

        @Override
        public void move() {
            System.out.println("BulletTrain: Glides smoothly at high velocity.");
        }
    }
