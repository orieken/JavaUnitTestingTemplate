package com.example.project;

public class ElectricHeater implements Heater {

    /**
     * This is a private boolean variable used to indicate if the heater is on or off.
     */
    private boolean heating;

    /**
     * This method is used to turn on the heater.
     * It sets the heating indicator to true and prints a message to console.
     */
    @Override
    public void on() {
        System.out.println("Heater is on");
        heating = true;
    }

    /**
     * This method is used to turn off the heater.
     * It sets the heating indicator to false and prints a message to console.
     */
    @Override
    public void off() {
        System.out.println("Heater is off");
        heating = false;
    }

    /**
     * This method is used to check if the heater is hot (working).
     * @return boolean This returns the current state of the heater (heating or not).
     */
    @Override
    public boolean isHot() {
        return heating;
    }
}
