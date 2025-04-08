package propertyinspection;
import realestate.Apartment;

public class DifferentPackageAccess {



        public void accessApartment() {
            Apartment apartment = new Apartment();

            // Cannot use setters because they have package access
            System.out.println("Apartment Address: " + apartment.getAddress());
            System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
        }
}
