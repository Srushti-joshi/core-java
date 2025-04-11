package internal;

import external.SchoolBag;

public class BagRunner {
        public static void main(String[] args) {
            Bag bag = new Bag();
            bag.carry();

            Bag schoolBag = new SchoolBag();
            schoolBag.carry();

            SchoolBag sb = new SchoolBag();
            sb.carry();
            sb.storeBooks();
        }
    }


