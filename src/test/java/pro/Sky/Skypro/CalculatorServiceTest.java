package pro.Sky.Skypro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void testPlus() {
        assertEquals(6, calculatorService.plus(3,3));
        assertEquals(-1, calculatorService.plus(-3,2));
        assertEquals(1, calculatorService.plus(3,-2));
        assertEquals(-5, calculatorService.plus(-3,-2));
        assertEquals(3, calculatorService.plus(0,3));
        assertEquals(3, calculatorService.plus(3,0));
        assertEquals(0, calculatorService.plus(0,0));
        assertEquals(-10, calculatorService.plus(0,-10));
        assertEquals(-20, calculatorService.plus(-20,0));
    }

    @Test
    void testMinus() {
        assertEquals(0, calculatorService.minus(3,3));
        assertEquals(-5, calculatorService.minus(-3,2));
        assertEquals(5, calculatorService.minus(3,-2));
        assertEquals(-1, calculatorService.minus(-3,-2));
        assertEquals(-3, calculatorService.minus(0,3));
        assertEquals(3, calculatorService.minus(3,0));
        assertEquals(0, calculatorService.minus(0,0));
        assertEquals(10, calculatorService.minus(0,-10));
        assertEquals(-20, calculatorService.minus(-20,0));
    }

    @Test
    void testMultiply() {
        assertEquals(2, calculatorService.multiply(1,2));
        assertEquals(-2, calculatorService.multiply(-1,2));
        assertEquals(-2, calculatorService.multiply(1,-2));
        assertEquals(-2, calculatorService.multiply(-1,-2));
        assertEquals(0, calculatorService.multiply(0,2));
        assertEquals(0, calculatorService.multiply(1,0));
        assertEquals(0, calculatorService.multiply(0,0));
        assertEquals(0, calculatorService.multiply(0,-10));
        assertEquals(0, calculatorService.multiply(-20,0));
    }

    @Test
    void testDivide() {
        assertEquals(0, calculatorService.divide(1,2));
        assertEquals(0, calculatorService.divide(0,2));
        assertEquals(-1, calculatorService.divide(10,-10));
        assertEquals(-1, calculatorService.divide(-20,20));
        assertEquals(2, calculatorService.divide(40,20));
        assertEquals(1, calculatorService.divide(-20,-20));

        assertThrows(IllegalAccessException.class, () -> calculatorService.divide(1,0));
    }


}