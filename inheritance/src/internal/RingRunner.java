package internal;

import external.GoldRing;

public class RingRunner {
        public static void main(String[] args) {
            Ring ring = new Ring();
            ring.wear();

            Ring goldRing = new GoldRing();
            goldRing.wear();

            GoldRing gr = new GoldRing();
            gr.wear();
            gr.shine();
        }

}
