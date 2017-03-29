package com.stateauto;

/**
 * Created by wea3765 on 3/28/2017.
 */
public class FizzBuzz {

    private boolean isEvenlyDivisible(int numerator, int denominator) {
        return numerator % denominator == 0;
    }

    private String pickFromTwoMods(int index, int mod1, int mod2, String mod1String, String mod2String) {
        String ret;
        if (isEvenlyDivisible(index, mod1) && isEvenlyDivisible(index, mod2)) {
            ret = mod1String + " " + mod2String;
        } else if (isEvenlyDivisible(index, mod1)) {
            ret = mod1String;
        } else if (isEvenlyDivisible(index, mod2)) {
            ret = mod2String;
        } else {
            ret = String.valueOf(index);
        }
        return ret;
    }

    public String[] countToManyAsString(int count) {
        String[] items= new String[count];
        for(int i =0;i<count; i++) {
            items[i] = pickFromTwoMods(i+1, 3, 5, "fizz", "buzz");
        }
        return items;
    }
}
