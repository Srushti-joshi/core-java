package internal;

import external.SportsCar;

public class CarRunner {
        public static void main(String[] args) {
            Car car = new Car();
            car.drive();

            Car sportsCar = new SportsCar();
            sportsCar.drive();

            SportsCar sc = new SportsCar();
            sc.drive();
            sc.turboBoost();
        }


}
