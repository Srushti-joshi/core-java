package external;

    import internal.SamePackageAccess;
import external.DifferentPackageAccess;
    public class MutantRunner {
        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessEntities();

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessinternal();
        }
    }


