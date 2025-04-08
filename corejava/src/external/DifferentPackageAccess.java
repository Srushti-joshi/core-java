package external;
import internal.Mutant;

public class DifferentPackageAccess {
    public void accessinternal() {
        Mutant mutant = new Mutant();

        // Cannot use setters because they have package access
        System.out.println("Mutant Power: " + mutant.getPower());
        System.out.println("Mutant Strength: " + mutant.getStrengthLevel());
        System.out.println("Is Hero: " + mutant.isHero());
        System.out.println("Origin: " + mutant.getOrigin());
        System.out.println("Weakness: " + mutant.getWeakness());
    }
}
