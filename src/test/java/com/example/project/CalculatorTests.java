package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CalculatorTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }
}