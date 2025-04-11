package internal;

import external.HighSchool;

public class SchoolRunner {
        public static void main(String[] args) {
            School school = new School();
            school.educate();

            School highSchool = new HighSchool();
            highSchool.educate();

            HighSchool hs = new HighSchool();
            hs.educate();
            hs.prepareForCollege();
        }
    }



