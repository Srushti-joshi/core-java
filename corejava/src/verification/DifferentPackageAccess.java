package verification;
import security.Badge;

public class DifferentPackageAccess {

        public void accessBadge() {
            Badge badge = new Badge();

            // Cannot use setters because they have package access
            System.out.println("Badge ID: " + badge.getBadgeId());
            System.out.println("Holder Name: " + badge.getHolderName());
        }
}
