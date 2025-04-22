package com.xworkz.internal;



    public interface Charger {
        void plugIn();
        void plugOut();
        void chargeDevice(int percentage);
        void checkStatus();
        void overchargeProtection();
    }

