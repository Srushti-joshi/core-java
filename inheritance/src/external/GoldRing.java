package external;

import internal.Ring;

    public class GoldRing extends Ring {
        public void shine() {
            System.out.println("GoldRing: Shines brightly with a golden glow.");
        }

        @Override
        public void wear() {
            System.out.println("GoldRing: Worn as a symbol of status or commitment.");
        }
    }


