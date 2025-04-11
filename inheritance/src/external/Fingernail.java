package external;

import internal.Nail;

    public class Fingernail extends Nail {
        public void paint() {
            System.out.println("Fingernail: Can be painted with nail polish.");
        }

        @Override
        public void grow() {
            System.out.println("Fingernail: Grows faster than toenails.");
        }
    }

