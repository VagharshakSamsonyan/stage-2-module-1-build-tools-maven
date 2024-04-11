package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = true;
        try {
            for (String elem : args) {
                Double number = Double.parseDouble(elem);
                if (number <= 0 || (number.isNaN())) {
                    result = false;
                    break;
                }
            }
        }
        catch (NumberFormatException e)
        {result = false;}

        return result;
    }
}