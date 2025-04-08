package customers;
import accessories.KeyChain;

public class DifferentPackageAccess {
        public void accessKeyChain() {
            KeyChain keyChain = new KeyChain();

            // Cannot use setters because they have package access
            System.out.println("KeyChain Material: " + keyChain.getMaterial());
            System.out.println("KeyChain Color: " + keyChain.getColor());
        }
    }

