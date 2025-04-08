package military;
import vehicles.Tank;

public class DifferentPackageAccess {

        public void accessTank() {
            Tank tank = new Tank();
            System.out.println("Tank Model: " + tank.getModel());
            System.out.println("Country: " + tank.getCountry());
        }

}
