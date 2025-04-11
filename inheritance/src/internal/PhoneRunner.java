package internal;

import external.Smartphone;

public class PhoneRunner {
        public static void main(String[] args) {
            Phone phone = new Phone();
            phone.call();

            Phone smartphone = new Smartphone();
            smartphone.call();

            Smartphone sp = new Smartphone();
            sp.call();
            sp.browseInternet();
        }


}
