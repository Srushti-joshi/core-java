package external;

import internal.Phone;

public class Smartphone extends Phone {
        public void browseInternet() {
            System.out.println("Smartphone: Browsing the internet.");
        }

        @Override
        public void call() {
            System.out.println("Smartphone: Making a call with video chat support.");
        }
    }



