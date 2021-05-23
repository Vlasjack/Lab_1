package com.company;

public class Palindrome {
    //check is input string is palindrome
    public static void main(String[] args) {

            String s = "abba";
            if (isPalindrome(s)) {
                System.out.println(s + " is palindrome");
            }else {
                System.out.println(s + " is not palindrome");
            }

        }
    //reverse string
    public static String reverseString(String inputString) {
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
    //comparison original string and reversed string
    public static boolean isPalindrome(String inputString){
        if (inputString.equals(reverseString(inputString))) {
            return true;
        }
        else
        {
            return false;
        }
    }
}