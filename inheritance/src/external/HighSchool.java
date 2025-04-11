package external;

import internal.School;

    public class HighSchool extends School {
        public void prepareForCollege() {
            System.out.println("HighSchool: Preparing students for college and future careers.");
        }

        @Override
        public void educate() {
            System.out.println("HighSchool: Offering advanced subjects and extracurricular activities.");
        }

}
