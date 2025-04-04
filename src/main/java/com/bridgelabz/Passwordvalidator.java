package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordvalidator {
    public boolean passwordChecker(String pass) {
        String regex=  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher =pattern.matcher(pass);
        return matcher.matches();
    }
}
