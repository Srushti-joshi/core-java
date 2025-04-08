package inspection;
import aviation.Jet;

public class DifferentPackageAccess {

        public void accessJet() {
            Jet jet = new Jet();

            System.out.println("Jet Model: " + jet.getModel());
            System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        }
}
