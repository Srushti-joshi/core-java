package com.xworkz.runner;


import com.xworkz.external.Smartphone;
import com.xworkz.internal.Phone;

public class PhoneRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Phone phone = new Smartphone();
            phone.makeCall("123-456-7890");
            phone.sendMessage("Hello, how are you?");
            phone.browseInternet();

            System.out.println("\n=== Using Class Reference ===");
            Smartphone smartphone = new Smartphone();
            smartphone.makeCall("098-765-4321");
            smartphone.sendMessage("Good Morning!");
            smartphone.browseInternet();
        }
    }
