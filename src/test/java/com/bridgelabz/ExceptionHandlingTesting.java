package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTesting {

    Calculator object;

    @BeforeEach
    public void setup(){
        object =new Calculator();
    }

    @Test
    public void testDivideByZeroThrowsException(){
        assertThrows(ArithmeticException.class,()->{
            object.divide(10,0);
        });
    }
}
