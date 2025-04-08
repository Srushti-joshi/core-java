package security;

public class SamePackageAccess {
    public void accessBadge() {
        Badge badge = new Badge();

        // Using setters (allowed within the same package)
        badge.setBadgeId(101);
        badge.setHolderName("John Doe");

        // Using getters
        System.out.println("Badge ID: " + badge.getBadgeId());
        System.out.println("Holder Name: " + badge.getHolderName());
    }

}
