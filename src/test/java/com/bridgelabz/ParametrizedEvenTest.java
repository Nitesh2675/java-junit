package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedEvenTest {


    private NumberUtils obj=new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void testIsEvenNumber(int number){
        Assertions.assertTrue(obj.isEven(number));
    }


}
