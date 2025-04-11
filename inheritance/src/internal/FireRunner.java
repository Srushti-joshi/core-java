package internal;

import external.WildFire;

public class FireRunner {
        public static void main(String[] args) {
            Fire fire = new Fire();
            fire.burn();

            Fire wildfire = new WildFire();
            wildfire.burn();

            WildFire wf = new WildFire();
            wf.burn();
            wf.spreadRapidly();
        }
    }


