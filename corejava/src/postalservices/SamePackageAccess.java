package postalservices;

public class SamePackageAccess {
    public void accessPostOffice() {
        PostOffice postOffice = new PostOffice();

        postOffice.setOfficeId(5001);
        postOffice.setLocation("New York");

        System.out.println("Post Office ID: " + postOffice.getOfficeId());
        System.out.println("Location: " + postOffice.getLocation());
    }
}
