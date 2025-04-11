package internal;

import external.EngineeringCollege;

public class CollegeRunner {
        public static void main(String[] args) {
            College college = new College();
            college.educate();

            College engCollege = new EngineeringCollege();
            engCollege.educate();

            EngineeringCollege ec = new EngineeringCollege();
            ec.educate();
            ec.conductLabExperiments();
        }
    }



