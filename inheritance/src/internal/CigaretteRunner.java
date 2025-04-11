package internal;

import external.ElectronicCigarette;

public class CigaretteRunner {
    public static void main(String[] args) {
        Cigarette cigarette = new Cigarette();
        cigarette.smoke();

        Cigarette eCig = new ElectronicCigarette();
        eCig.smoke();

        ElectronicCigarette ec = new ElectronicCigarette();
        ec.smoke();
        ec.charge();
    }
}
