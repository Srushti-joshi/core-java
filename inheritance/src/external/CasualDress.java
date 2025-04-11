package external;

import internal.Dress;

public class CasualDress extends Dress {
        public void style() {
            System.out.println("CasualDress: This dress is styled for casual wear.");
        }

        @Override
        public void wear() {
            System.out.println("CasualDress: Wearing a comfortable casual dress.");
        }
    }

