package com.xworkz.runner;


import com.xworkz.external.TechCompany;
import com.xworkz.internal.Company;

public class CompanyRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Company company = new TechCompany();
            company.hireEmployee();
            company.conductMeeting();
            company.developProduct();
            company.provideSupport();
            company.paySalary();
            company.releaseUpdate();
            company.evaluatePerformance();

            System.out.println("\n=== Using Class Reference ===");
            TechCompany techCompany = new TechCompany();
            techCompany.hireEmployee();
            techCompany.conductMeeting();
            techCompany.developProduct();
            techCompany.provideSupport();
            techCompany.paySalary();
            techCompany.releaseUpdate();
            techCompany.evaluatePerformance();
        }
    }
