package healthcheck;
import fitnesscenter.SamePackageAccess;
import healthcheck.DifferentPackageAccess;

public class GymRunner {
    public static void main(String[] args) {
        System.out.println("=== Accessing from the Same Package ===");
        SamePackageAccess samePackage = new SamePackageAccess();
        samePackage.accessGym();

        System.out.println("\n=== Accessing from a Different Package ===");
        DifferentPackageAccess diffPackage = new DifferentPackageAccess();
        diffPackage.accessGym();
    }
}

