package healthcheck;
import fitnesscenter.Gym;

public class DifferentPackageAccess {
    public void accessGym() {
        Gym gym = new Gym();

        // Cannot use setters because they have package access
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Membership Count: " + gym.getMembershipCount());
    }
}
