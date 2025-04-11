package internal;

import external.BathTowel;

public class TowelRunner {
        public static void main(String[] args) {
            Towel towel = new Towel();
            towel.dry();

            Towel bathTowel = new BathTowel();
            bathTowel.dry();

            BathTowel bt = new BathTowel();
            bt.dry();
            bt.softTexture();
        }
    }


