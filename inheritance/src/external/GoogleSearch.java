package external;

import internal.Google;


    public class GoogleSearch extends Google {
        public void searchFeature() {
            System.out.println("GoogleSearch: Allows users to search the internet.");
        }

        @Override
        public void service() {
            System.out.println("GoogleSearch: Specializes in internet searches.");
        }
    }
