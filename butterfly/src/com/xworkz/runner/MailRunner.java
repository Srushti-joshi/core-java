package com.xworkz.runner;


import com.xworkz.external.Email;
import com.xworkz.internal.Mail;

public class MailRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Mail mail = new Email();
            mail.compose();
            mail.send();
            mail.receive();

            System.out.println("\n=== Using Class Reference ===");
            Email email = new Email();
            email.compose();
            email.send();
            email.receive();
        }
    }
