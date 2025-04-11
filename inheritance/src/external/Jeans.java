package external;

import internal.Pant;

    public class Jeans extends Pant {
        public void material() {
            System.out.println("Jeans: Made of denim fabric.");
        }

        @Override
        public void wear() {
            System.out.println("Jeans: Stylish and durable pants.");
        }
    }


