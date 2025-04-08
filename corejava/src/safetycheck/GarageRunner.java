package safetycheck;
import vehiclemaintenance.SamePackageAccess;
import safetycheck.DifferentPackageAccess;

public class GarageRunner {

        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessGarage();

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessGarage();
        }

}
