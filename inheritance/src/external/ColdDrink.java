package external;

import internal.Drink;


    public class ColdDrink extends Drink {
        public void chillLevel() {
            System.out.println("ColdDrink: Served chilled to refresh on hot days.");
        }

        @Override
        public void consume() {
            System.out.println("ColdDrink: Cool and fizzy—best served cold!");
        }
    }
