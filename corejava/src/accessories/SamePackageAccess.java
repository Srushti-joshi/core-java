package accessories;

public class SamePackageAccess {
    public void accessKeyChain() {
        KeyChain keyChain = new KeyChain();

        // Using setters (allowed within the same package)
        keyChain.setMaterial("Metal");
        keyChain.setColor("Silver");

        // Using getters
        System.out.println("KeyChain Material: " + keyChain.getMaterial());
        System.out.println("KeyChain Color: " + keyChain.getColor());
    }

}
