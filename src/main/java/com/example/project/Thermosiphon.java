package com.example.project;

public class Thermosiphon implements Pump {
    private final Heater heater; // Consider renaming this variable to avoid hiding the field

    /**
     * Constructs a new Thermosiphon with the specified heater.
     *
     * @param heater the heater to use
     */
    public Thermosiphon(final Heater heater) {
        this.heater = heater;
    }

    /**
     * Starts pumping water if the heater is hot.
     */
    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("Pumping water");
        }
    }
}
