package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.util.StringUtils;

public class StringTest {

    @Test
    public void reverseTest(){
        Assertions.assertEquals("olleh", StringUtils.reverse("hello"));
    }
    @Test
    public void isPalindromeTest(){
      Assertions.assertTrue(StringUtils.isPalndrome("1"));
    }
    @Test
    public void toUppercaseTest(){
        Assertions.assertEquals("HELLO",StringUtils.toUpperCase("hello"));
    }
}
