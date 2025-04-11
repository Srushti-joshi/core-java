package external;


import internal.Bus;

public class ElectricBus extends Bus {
    public void chargeBattery() {
        System.out.println("ElectricBus: Charging the battery for eco-friendly travel.");
    }

    @Override
    public void drive() {
        System.out.println("ElectricBus: Driving quietly with zero emissions.");
    }
}

