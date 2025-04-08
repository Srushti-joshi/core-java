package aviation;

public class SamePackageAccess {
    public void accessJet() {
        Jet jet = new Jet();

        jet.setModel("F-22 Raptor");
        jet.setMaxSpeed(2410.0);

        System.out.println("Jet Model: " + jet.getModel());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
    }
}

