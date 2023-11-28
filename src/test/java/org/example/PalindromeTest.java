package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    @BeforeEach
    public void setUp()
    {

    }
    @Test
    void testPalindromeFalse() {
        assertFalse(palindrome.IsWordPalindrome("reviled"));
    }
    @Test
    void testPalindromeTrue ()
    {
        assertTrue(palindrome.IsWordPalindrome("nun"));
    }
    @Test
    void testPalindromeFalseWithTwoWords ()
    {
        assertFalse(palindrome.IsWordPalindrome("evil olive"));
    }
}