package internal;

import external.OfficeChair;

public class ChairRunner {
        public static void main(String[] args) {
            Chair chair = new Chair();
            chair.sit();

            Chair officeChair = new OfficeChair();
            officeChair.sit();

            OfficeChair oc = new OfficeChair();
            oc.sit();
            oc.adjustHeight();
        }
    }

