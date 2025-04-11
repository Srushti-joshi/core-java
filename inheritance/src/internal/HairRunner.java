package internal;

import external.CurleyHair;

public class HairRunner {
        public static void main(String[] args) {
            Hair hair = new Hair();
            hair.grow();

            Hair curlyHair = new CurleyHair();
            curlyHair.grow();

            CurleyHair ch = new CurleyHair();
            ch.grow();
            ch.bounce();
        }
    }


