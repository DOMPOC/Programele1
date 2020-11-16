package com.corona.coronazp20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String REGEX_USERNAME_PATTERN = "^[a-zA-Z]{3,20}$";
    public static final String REGEX_PASSWORD_PATTERN = "^[a-zA-Z0-9.!@_]{5,20}$";

    public static boolean isValidUsername(String username){
        Pattern pattern = Pattern.compile(REGEX_USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);

        return matcher.find();
    }
    public static boolean isValidPassword(String password){
        Pattern pattern = Pattern.compile(REGEX_PASSWORD_PATTERN);//pagal eilute susikuriam taisykles
        Matcher matcher = pattern.matcher(password);//pagal taisykles palyginam vartotojo ivesta reiksme

        return matcher.find();//grazina true jeigu atitinka, false jei neatitinka
    }
}
