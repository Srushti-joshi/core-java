package external;

import internal.Photo;
    public class DigitalPhoto extends Photo {
        public void edit() {
            System.out.println("DigitalPhoto: Editing the photo using software.");
        }

        @Override
        public void display() {
            System.out.println("DigitalPhoto: Displaying on a digital screen.");
        }
    }


