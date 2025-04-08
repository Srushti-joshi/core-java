package customers;
import accessories.SamePackageAccess;
import customers.DifferentPackageAccess;


public class KeyChainRunner {

        public static void main(String[] args) {
            System.out.println("=== Accessing from the Same Package ===");
            SamePackageAccess samePackage = new SamePackageAccess();
            samePackage.accessKeyChain(); // Fixed method call

            System.out.println("\n=== Accessing from a Different Package ===");
            DifferentPackageAccess diffPackage = new DifferentPackageAccess();
            diffPackage.accessKeyChain(); // Fixed method call
        }

}
