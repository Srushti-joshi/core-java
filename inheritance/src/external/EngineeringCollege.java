package external;

import internal.College;
    public class EngineeringCollege extends College {
        public void conductLabExperiments() {
            System.out.println("EngineeringCollege: Conducting practical lab experiments.");
        }

        @Override
        public void educate() {
            System.out.println("EngineeringCollege: Offering specialized technical education.");
        }
    }


