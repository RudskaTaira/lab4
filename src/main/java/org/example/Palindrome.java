package org.example;

public class Palindrome {

    public boolean IsWordPalindrome(String word)
    {
        word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int begin=0;
        int end = word.length()-1;

        while (begin < end) {
            if (word.charAt(begin) != word.charAt(end)) {
                return false;  // It's not a palindrome if there's a mismatch
            }
            begin++;
            end--;
        }

        return true;
    }
}
