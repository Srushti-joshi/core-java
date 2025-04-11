package internal;

import external.FullMoon;

public class MoonRunner {
        public static void main(String[] args) {
            Moon moon = new Moon();
            moon.glow();

            Moon fullMoon = new FullMoon();
            fullMoon.glow();

            FullMoon fm = new FullMoon();
            fm.glow();
            fm.reflectLight();
        }

    }
