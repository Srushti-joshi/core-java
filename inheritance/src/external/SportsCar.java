package external;

import internal.Car;

public class SportsCar extends Car {
        public void turboBoost() {
            System.out.println("SportsCar: Engaging turbo boost for high speed!");
        }

        @Override
        public void drive() {
            System.out.println("SportsCar: Driving at high speed with superior handling.");
        }
    }


