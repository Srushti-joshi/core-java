package external;

import internal.Top;

    public class SpinningTop extends Top {
        public void balance() {
            System.out.println("SpinningTop: Maintains balance while spinning.");
        }

        @Override
        public void spin() {
            System.out.println("SpinningTop: Spins rapidly with high precision.");
        }


}
