package vehiclemaintenance;

public class SamePackageAccess {
    public void accessGarage() {
        Garage garage = new Garage();

        garage.setLocation("Uptown");
        garage.setCapacity(100);

        System.out.println("Garage Location: " + garage.getLocation());
        System.out.println("Capacity: " + garage.getCapacity() + " cars");
    }
}
