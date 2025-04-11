package internal;

import external.SafetyPin;

public class PinRunner {
        public static void main(String[] args) {
            Pin pin = new Pin();
            pin.use();

            Pin safetyPin = new SafetyPin();
            safetyPin.use();

            SafetyPin sp = new SafetyPin();
            sp.use();
            sp.lock();
        }
    }


