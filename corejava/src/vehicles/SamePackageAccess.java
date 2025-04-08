package vehicles;

public class SamePackageAccess {
    public void accessTank() {
        Tank tank = new Tank();

        // Using setters (allowed within the same package)
        tank.setModel("Leopard 2");
        tank.setCountry("Germany");

        // Using getters
        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
    }
}
