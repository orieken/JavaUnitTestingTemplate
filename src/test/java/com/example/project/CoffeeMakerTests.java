// src/test/java/com/example/CoffeeMakerTest.java

package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CoffeeMakerTests {
    private CoffeePot coffeePot;
    private Heater heater;
    private Pump pump;

    @BeforeEach
    void setUp() {
        heater = mock(Heater.class);
        pump = mock(Pump.class);
        coffeePot = new CoffeeMaker(heater, pump);
    }

    @Test
    void testBrew() {
        // Arrange

        // Act
        coffeePot.brew();

        // Assert
        verify(heater).on();
        verify(pump).pump();
        verify(heater).off();
    }
}
