package com.bridgelabz;

public class LongRunningTest {
    public static String longRunnigTest() throws InterruptedException{
        Thread.sleep(3000);
        return "done";
    }
}
