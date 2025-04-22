package com.xworkz.external;

import com.xworkz.internal.Phone;


    public class Smartphone implements Phone {

        @Override
        public void makeCall(String phoneNumber) {
            System.out.println("Making a call to " + phoneNumber);
        }

        @Override
        public void sendMessage(String message) {
            System.out.println("Sending message: " + message);
        }

        @Override
        public void browseInternet() {
            System.out.println("Browsing the internet on the smartphone");
        }
    }

