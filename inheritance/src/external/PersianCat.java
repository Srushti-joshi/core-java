package external;

import internal.Cat;

public class PersianCat extends Cat {
        public void fluffyFur() {
            System.out.println("PersianCat: Has long, fluffy fur.");
        }

        @Override
        public void makeSound() {
            System.out.println("PersianCat: Purrs softly and meows elegantly.");
        }
    }


