package backgroundcheck;
import careers.SamePackageAccess;
import backgroundcheck.DifferentPackageAccess;

public class OccupationRunner {

        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessOccupation();

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessOccupation();
        }
    }

