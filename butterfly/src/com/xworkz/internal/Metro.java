package com.xworkz.internal;


        public interface Metro {
            void startService();
            void stopService();
            void setRoute(String route);
            void openDoors();
            void closeDoors();
            void setSpeed(int speed);
            void announceArrival(String station);
            void checkTicket();
            void checkPassengerCount();
        }



