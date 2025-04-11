package external;

import internal.Fan;

public class CeilingFan extends Fan {
        public void adjustSpeed() {
            System.out.println("CeilingFan: Adjusting speed settings.");
        }


        public void rotate() {
            System.out.println("CeilingFan: Rotating at adjustable speed.");
        }
    }


