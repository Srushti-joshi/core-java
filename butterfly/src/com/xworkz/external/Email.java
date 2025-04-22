package com.xworkz.external;


import com.xworkz.internal.Mail;

public class Email implements Mail {

        @Override
        public void compose() {
            System.out.println("Composing an email");
        }

        @Override
        public void send() {
            System.out.println("Sending the email");
        }

        @Override
        public void receive() {
            System.out.println("Receiving the email");
        }
    }

