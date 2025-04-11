package external;

import internal.Pin;

    public class SafetyPin extends Pin {
        public void lock() {
            System.out.println("SafetyPin: Has a locking mechanism for safety.");
        }

        @Override
        public void use() {
            System.out.println("SafetyPin: Used to hold fabric or materials securely.");
        }

}
