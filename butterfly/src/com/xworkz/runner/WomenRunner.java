package com.xworkz.runner;

import com.xworkz.external.WorkingWoman;
import com.xworkz.internal.Women;



    public class WomenRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Women women = new WorkingWoman();
            women.work();
            women.dressUp();
            women.takeCareOfFamily();
            women.attendMeetings();
            women.relax();

            System.out.println("\n=== Using Class Reference ===");
            WorkingWoman workingWoman = new WorkingWoman();
            workingWoman.work();
            workingWoman.dressUp();
            workingWoman.takeCareOfFamily();
            workingWoman.attendMeetings();
            workingWoman.relax();
        }
    }
