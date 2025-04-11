package internal;

import external.SportsBike;

public class BikeRunner {
        public static void main(String[] args) {
            Bike bike = new Bike();
            bike.ride();

            Bike sportsBike = new SportsBike();
            sportsBike.ride();

            SportsBike sb = new SportsBike();
            sb.ride();
            sb.turboBoost();
        }
    }


