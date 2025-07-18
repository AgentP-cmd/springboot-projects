package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void shouldBeTurnedOff(){
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnOn(){
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnOff(){
        calculator.turnOn();
        assertTrue(calculator.isOn());

        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldBeTurnedOffAfterOpened(){
        calculator.turnOn();
        assertFalse(calculator.isOff());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    //Addition

    @Test
    void testSum(){
        int sumResult = calculator.sum(1,5);
        assertEquals(6, sumResult);
    }

    @Test
    void testLongAdditionResult(){
        Long sumResult = calculator.sum(100L,500L);
        assertEquals(600L,sumResult, .0001);
    }

    @Test
    void testShortAdditionResult(){
        short sumResult = calculator.sum((short)3,(short)5);
        assertEquals(8,sumResult);
    }

    @Test
    void testFloatAdditionResult(){
        float sumResult = calculator.sum(1.1f,5.6f);
        assertEquals(6.7,sumResult, .0001);
    }

    @Test
    void testDoubleAdditionResult(){
        double sumResult = calculator.sum(1.1d,5.6d);
        assertEquals(6.7,sumResult, .0001);
    }

    //Difference

    @Test
    void testDifference(){
        int diffResult = calculator.difference(5,1);
        assertEquals(4, diffResult);
    }

    @Test
    void testLongDifferenceResult(){
        Long diffResult = calculator.difference(500L,100L);
        assertEquals(400,diffResult);
    }
    @Test
    void testShortDifferenceResult(){
        short diffResult=  calculator.difference((short)3,(short)5);
        assertEquals(-2,diffResult);
    }
    @Test
    void testFloatDifferenceResult(){
        float diffResult = calculator.difference(5.6f,1.2f);
        assertEquals(4.4,diffResult,.0001);
    }

    @Test
    void testDoubleDifferenceResult(){
        double diffResult = calculator.difference(5.6d, 1.2d);
        assertEquals(4.4,diffResult,.0001);
    }

    //Multiplication

    @Test
    void testProduct(){
        int productResult = calculator.product(2,4);
        assertEquals(8,productResult);
    }

    @Test
    void testLongProductResult(){
        Long productResult = calculator.product(1000L, 200L);
        assertEquals(200000,productResult);
    }
    @Test
    void testShortProductResult(){
        short productResult= calculator.product((short)3,(short)5);
        assertEquals(15,productResult);
    }
    @Test
    void testFloatProductResult(){
        float productResult = calculator.product(2.2f,3.3f);
        assertEquals(7.26,productResult,.0001);
    }

    @Test
    void testDoubleProductResult(){
        double productResult = calculator.product(2.2d,3.3d);
        assertEquals(7.26, productResult,.0001);
    }


    //Divide
    @Test
    void testQuotient(){
        int quotientResult = calculator.quotient(4,2);
        assertEquals(2,quotientResult);
    }
    @Test
    void divideByZero(){
        Exception exception = assertThrows
                (ArithmeticException.class,
                        () -> calculator.quotient(1,0));
        assertEquals("/ by zero",exception.getMessage());
    }

    @Test
    void testLongQuotientResult(){
        Long quotientResult = calculator.quotient(1000L, 200L);
        assertEquals(5,quotientResult);
    }
    @Test
    void divideByZeroLong(){
        Exception exception = assertThrows
                (ArithmeticException.class,
                        () -> calculator.quotient(1L,0L));
        assertEquals("/ by zero",exception.getMessage());
    }
    @Test
    void testShortQuotientResult(){
        short quotientResult=calculator.quotient((short)10,(short)2);
        assertEquals(5,quotientResult);
    }
    @Test
    void divideByZeroShort(){
        Exception exception = assertThrows
                (ArithmeticException.class,
                        () -> calculator.quotient((short)1,(short)0));
        assertEquals("/ by zero",exception.getMessage());
    }
    @Test
    void testFloatQuotientResult(){
        float quotientResult = calculator.quotient(10.5f,2.5f);
        assertEquals(4.2000,quotientResult,.0001);
    }
    @Test
    void divideByZeroFloat(){
        Exception exception = assertThrows
                (ArithmeticException.class,
                        () -> calculator.quotient(1f,0f));
        assertEquals("/ by zero",exception.getMessage());
    }
    @Test
    void testDoubleQuotientResult(){
        double quotientResult = calculator.quotient(10.9,3.2d);
        assertEquals(3.4062, quotientResult,.0001);
    }
    @Test
    void divideByZeroDouble(){
        Exception exception = assertThrows
                (ArithmeticException.class,
                        () -> calculator.quotient(1d,0d));
        assertEquals("/ by zero",exception.getMessage());
    }

}