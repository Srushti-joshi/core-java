package external;

import internal.Mail;

    public class Email extends Mail {
        public void attachFile() {
            System.out.println("Email: Attaching a file to the email.");
        }

        @Override
        public void send() {
            System.out.println("Email: Sending an electronic mail.");
        }
    }

