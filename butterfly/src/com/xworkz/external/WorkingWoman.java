package com.xworkz.external;


import com.xworkz.internal.Women;

public class WorkingWoman implements Women {

        @Override
        public void work() {
            System.out.println("WorkingWoman is working at the office");
        }

        @Override
        public void dressUp() {
            System.out.println("WorkingWoman is dressing up for work");
        }

        @Override
        public void takeCareOfFamily() {
            System.out.println("WorkingWoman is taking care of her family");
        }

        @Override
        public void attendMeetings() {
            System.out.println("WorkingWoman is attending meetings at work");
        }

        @Override
        public void relax() {
            System.out.println("WorkingWoman is relaxing after work");
        }
    }

