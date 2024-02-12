package com.example.project;

public class ElectricHeater implements Heater {
    private boolean heating;

    @Override
    public void on() {
        System.out.println("Heater is on");
        heating = true;
    }

    @Override
    public void off() {
        System.out.println("Heater is off");
        heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
