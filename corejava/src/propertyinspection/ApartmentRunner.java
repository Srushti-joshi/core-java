package propertyinspection;
import realestate.SamePackageAccess;
import propertyinspection.DifferentPackageAccess;


public class ApartmentRunner {

        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessApartment();

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessApartment();
        }
}
