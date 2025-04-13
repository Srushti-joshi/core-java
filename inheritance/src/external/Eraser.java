package external;


    public class Eraser extends Rubber {
        public void shape() {
            System.out.println("Eraser: Comes in various shapes and sizes.");
        }

        @Override
        public void use() {
            System.out.println("Eraser: Erases cleanly and leaves minimal residue.");
        }
    }


