package fitnesscenter;

public class SamePackageAccess {
    public void accessGym() {
        Gym gym = new Gym();

        gym.setName("Iron Fit");
        gym.setMembershipCount(200);

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Membership Count: " + gym.getMembershipCount());
    }
}
