package external;

import internal.Tank;

public class BattleTank extends Tank {
        public void fireCannon() {
            System.out.println("BattleTank: Firing the cannon!");
        }

        @Override
        public void move() {
            System.out.println("BattleTank: Moving strategically on the battlefield.");
        }
    }

