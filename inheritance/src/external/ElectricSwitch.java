package external;

import internal.Switch;
    public class ElectricSwitch extends Switch {
        public void turnOff() {
            System.out.println("ElectricSwitch: Turning off the device.");
        }

        @Override
        public void turnOn() {
            System.out.println("ElectricSwitch: Safely turning on the electrical circuit.");
        }
    }


