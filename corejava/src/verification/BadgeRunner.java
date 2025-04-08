package verification;
import security.SamePackageAccess;
import verification.DifferentPackageAccess;

public class BadgeRunner {
        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessBadge();

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessBadge();
        }
}
