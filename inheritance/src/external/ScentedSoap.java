package external;

import internal.Soap;

public class ScentedSoap extends Soap {
        public void addFragrance() {
            System.out.println("ScentedSoap: Has a pleasant fragrance.");
        }

        @Override
        public void cleanse() {
            System.out.println("ScentedSoap: Cleans while leaving a fresh scent.");
        }
    }

