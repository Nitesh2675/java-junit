package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {

    Passwordvalidator user1;
    @BeforeEach
    void setup(){
        user1=new Passwordvalidator();
    }
    @Test
    public void PasswordStrengthTestValid(){
       // user1.passwordChecker("12345678A");
        Assertions.assertEquals(true,user1.passwordChecker("12345678@Aa"));
    }
    @Test
    public void PasswordStrengthTestInValid(){
        // user1.passwordChecker("12345");
        Assertions.assertEquals(false,user1.passwordChecker("123"));
    }


}
