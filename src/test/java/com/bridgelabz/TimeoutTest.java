package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest{
    @Test
    @Timeout(value=2,unit = TimeUnit.SECONDS)
    public void TimeoutTest() throws InterruptedException{
        String result=LongRunningTest.longRunnigTest();
        Assertions.assertEquals("done",result);
    }
}
