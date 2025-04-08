package tracking;
import postalservices.SamePackageAccess;
import tracking.DifferentPackageAccess;

public class PostOfficeRunner {

        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessPostOffice();

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessPostOffice();
        }
}
