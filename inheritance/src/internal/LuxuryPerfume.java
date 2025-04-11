package internal;

import external.Perfume;

    public class LuxuryPerfume extends Perfume {
        public void longLastingEffect() {
            System.out.println("LuxuryPerfume: Provides a long-lasting fragrance.");
        }

        @Override
        public void spray() {
            System.out.println("LuxuryPerfume: Spraying premium fragrance.");
        }
    }

