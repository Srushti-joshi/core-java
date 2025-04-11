package internal;

import external.WineGlass;

public class GlassRunner {
        public static void main(String[] args) {
            Glass glass = new Glass();
            glass.fill();

            Glass wineGlass = new WineGlass();
            wineGlass.fill();

            WineGlass wg = new WineGlass();
            wg.fill();
            wg.swirl();
        }
}
