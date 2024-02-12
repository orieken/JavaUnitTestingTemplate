package com.example.project;

public class CoffeeMaker implements CoffeePot {
    private final Heater heater;
    private final Pump pump;

    /**
     * Constructs a new CoffeeMaker with the specified heater and pump.
     *
     * @param heater the heater to use
     * @param pump the pump to use
     */
    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    /**
     * Brews coffee using the heater and pump.
     */
    @Override
    public void brew() {
        heater.on();
        pump.pump();
        System.out.println("Coffee is brewed");
        heater.off();
    }
}
