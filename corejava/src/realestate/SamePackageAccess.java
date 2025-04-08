package realestate;

public class SamePackageAccess {
    public void accessApartment() {
        Apartment apartment = new Apartment();

        apartment.setAddress("123 Main Street");
        apartment.setNumberOfRooms(3);


        System.out.println("Apartment Address: " + apartment.getAddress());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
    }
}
