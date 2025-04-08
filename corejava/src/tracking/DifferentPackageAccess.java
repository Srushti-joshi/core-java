package tracking;
import postalservices.PostOffice;

public class DifferentPackageAccess {

        public void accessPostOffice() {
            PostOffice postOffice = new PostOffice();

            System.out.println("Post Office ID: " + postOffice.getOfficeId());
            System.out.println("Location: " + postOffice.getLocation());
        }
}
