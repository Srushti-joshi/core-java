package external;

import internal.Chair;

    public class OfficeChair extends Chair {
        public void adjustHeight() {
            System.out.println("OfficeChair: Adjusting chair height for comfort.");
        }

        @Override
        public void sit() {
            System.out.println("OfficeChair: Sitting comfortably on an office chair.");
        }
    }


