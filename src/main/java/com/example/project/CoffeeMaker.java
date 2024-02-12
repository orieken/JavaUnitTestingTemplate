package com.example.project;

public class CoffeeMaker implements CoffeePot {
    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    @Override
    public void brew() {
        heater.on();
        pump.pump();
        System.out.println("Coffee is brewed");
        heater.off();
    }
}
