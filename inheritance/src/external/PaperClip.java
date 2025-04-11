package external;

import internal.Clip;

    public class PaperClip extends Clip {
        public void bend() {
            System.out.println("PaperClip: Can be bent into different shapes.");
        }

        @Override
        public void hold() {
            System.out.println("PaperClip: Specifically holds papers together.");
        }
    }


