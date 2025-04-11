package internal;

import external.Room;

    public class BedRoom extends Room {
        public void sleep() {
            System.out.println("Bedroom: A place to sleep and rest.");
        }

        @Override
        public void describe() {
            System.out.println("Bedroom: A cozy space with a bed for sleeping.");
        }
    }
