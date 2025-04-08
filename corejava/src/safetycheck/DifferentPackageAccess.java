package safetycheck;
import vehiclemaintenance.Garage;

public class DifferentPackageAccess {
        public void accessGarage() {
            Garage garage = new Garage();

            // Cannot use setters because they have package access
            System.out.println("Garage Location: " + garage.getLocation());
            System.out.println("Capacity: " + garage.getCapacity() + " cars");
        }
}
