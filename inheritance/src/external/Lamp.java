package external;

    public class Lamp extends Light {
        public void adjustBrightness() {
            System.out.println("Lamp: Allows brightness adjustment.");
        }

        @Override
        public void illuminate() {
            System.out.println("Lamp: Illuminates with adjustable brightness.");
        }
    }


