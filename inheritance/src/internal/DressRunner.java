package internal;

import external.CasualDress;

public class DressRunner {
        public static void main(String[] args) {
            Dress dress = new Dress();
            dress.wear();

            Dress casualDress = new CasualDress();
            casualDress.wear();

            CasualDress cd = new CasualDress();
            cd.wear();
            cd.style();
        }
    }


