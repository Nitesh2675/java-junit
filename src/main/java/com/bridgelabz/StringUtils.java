package com.bridgelabz;

public class StringUtils {

    public static String reverse(String str) {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalndrome(String str) {
        return str.equals(reverse(str));
    }

    public static String toUpperCase(String str) {
       return str.toUpperCase();
    }


}
