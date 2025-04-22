package com.xworkz.external;


import com.xworkz.internal.Company;

public class TechCompany implements Company {

        @Override
        public void hireEmployee() {
            System.out.println("TechCompany is hiring a new employee");
        }

        @Override
        public void conductMeeting() {
            System.out.println("TechCompany is conducting a team meeting");
        }

        @Override
        public void developProduct() {
            System.out.println("TechCompany is developing a new product");
        }

        @Override
        public void provideSupport() {
            System.out.println("TechCompany is providing customer support");
        }

        @Override
        public void paySalary() {
            System.out.println("TechCompany is paying salaries to employees");
        }

        @Override
        public void releaseUpdate() {
            System.out.println("TechCompany has released a new update");
        }

        @Override
        public void evaluatePerformance() {
            System.out.println("TechCompany is evaluating employee performance");
        }
    }
