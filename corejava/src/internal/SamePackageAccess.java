package internal;

public class SamePackageAccess {
    public void accessEntities() {
        Mutant mutant = new Mutant();
        mutant.setPower("Telekinesis");
        mutant.setStrengthLevel(85);
        mutant.setHero(true);
        mutant.setOrigin("X-Lab");
        mutant.setWeakness("Fire");

        System.out.println("Mutant Power: " + mutant.getPower());
        System.out.println("Mutant Strength: " + mutant.getStrengthLevel());
        System.out.println("Is Hero: " + mutant.isHero());
        System.out.println("Origin: " + mutant.getOrigin());
        System.out.println("Weakness: " + mutant.getWeakness());
    }
}

