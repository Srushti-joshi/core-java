package external;

    public class SmartWatch extends Watch {
        public void trackFitness() {
            System.out.println("SmartWatch: Tracks fitness data and health metrics.");
        }

        @Override
        public void displayTime() {
            System.out.println("SmartWatch: Displays time with additional features like notifications.");
        }
    }
