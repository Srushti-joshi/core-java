package internal;

import external.KingSizeBed;

public class BedRunner {
        public static void main(String[] args) {
            Bed bed = new Bed();
            bed.sleep();

            Bed kingBed = new KingSizeBed();
            kingBed.sleep();

            KingSizeBed kb = new KingSizeBed();
            kb.sleep();
            kb.extraSpace();
        }
    }


