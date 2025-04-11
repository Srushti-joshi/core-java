package internal;

import external.BattleTank;

public class TankRunner {
        public static void main(String[] args) {
            Tank tank = new Tank();
            tank.move();

            Tank battleTank = new BattleTank();
            battleTank.move();

            BattleTank bt = new BattleTank();
            bt.move();
            bt.fireCannon();
        }
    }


