package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalulatorTest {

    private Calculator obj;

    @BeforeEach
    public void setup(){
    obj=new Calculator();
    }
    @Test
    public void addTest(){
        int actual=obj.add(10,5);
        Assertions.assertEquals(15,actual);
    }

    @Test
    public void subtractTest(){
       int actual= obj.subtract(10,5);
       Assertions.assertEquals(5,actual);
    }

    @Test
    public void multiplyTest(){
        int actual= obj.multiply(10,5);
        Assertions.assertEquals(50,actual);
    }

    @Test
    public void divideTest(){
        int actual= obj.divide(10,5);
        Assertions.assertEquals(2,actual);
    }
}
