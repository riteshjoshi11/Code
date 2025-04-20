package org.example.twoPointer;
/*
or two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
 */

public class GcdOfString {
    public static void main(String args[]) {
        String gcd = gcdOfStrings("ABABAB", "ABAB");
        System.out.println("GCD ... " + gcd);
    }

    public static String  gcdOfStrings(String str1, String str2) {
        // Check if the strings can be formed by the same base pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring from 0 to gcdLength
        return str1.substring(0, gcdLength);

    }
    // Helper method to find GCD of two integers
    private static int gcd(int len1, int len2) {
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }
}
