package internal;

import external.Horse;
    public class RaceHorse extends Horse {
        public void sprint() {
            System.out.println("RaceHorse: Sprints at top speed on the racetrack.");
        }

        @Override
        public void gallop() {
            System.out.println("RaceHorse: Gallops at an accelerated pace during a race.");
        }
    }

