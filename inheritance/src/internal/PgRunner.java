package internal;

import external.LuxuryPg;

public class PgRunner {
        public static void main(String[] args) {
            Pg pg = new Pg();
            pg.provideAccommodation();

            Pg luxuryPG = new LuxuryPg();
            luxuryPG.provideAccommodation();

            LuxuryPg lp = new LuxuryPg();
            lp.provideAccommodation();
            lp.provideFood();
        }
    }


