package external;

import internal.Hair;

public class CurleyHair extends Hair {
        public void bounce() {
            System.out.println("CurlyHair: Bouncing with volume and texture.");
        }

        @Override
        public void grow() {
            System.out.println("CurlyHair: Growing in tight curls.");
        }
    }

