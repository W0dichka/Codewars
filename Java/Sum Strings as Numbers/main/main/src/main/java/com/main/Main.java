package com.main;

import java.util.ArrayList;

public class Main {

 public static String sumStrings(String a, String b) {
        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++) {
            int digitA = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int digitB = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}