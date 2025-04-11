package external;

import internal.Bag;

    public class SchoolBag extends Bag {
        public void storeBooks() {
            System.out.println("SchoolBag: Stores books and stationery.");
        }

        @Override
        public void carry() {
            System.out.println("SchoolBag: Used by students to carry study materials.");
        }
    }


