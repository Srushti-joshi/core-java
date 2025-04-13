package external;

    public class BeachTowel extends Towel {
        public void beachReady() {
            System.out.println("BeachTowel: Large and ideal for the beach.");
        }

        @Override
        public void dry() {
            System.out.println("BeachTowel: Dries the body after a swim at the beach.");
        }
    }

