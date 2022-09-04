package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static Backend_Java.lesson3.Palindrome.isPalindrome;

public class PalindromeChecker {

    @Test
    @DisplayName("Проверка палиндрома с четным количеством символов")
    void palindromeTestAnEvenNumber() {
        boolean result = isPalindrome("abba");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Проверка палиндрома с нечетным количеством символов")
    void palindromeTestOddNumber() {
        boolean result = isPalindrome("aba");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Проверка неверного палиндрома")
    void palindromeIncorrect() {
        boolean result = isPalindrome("abbc");
        Assertions.assertEquals(false, result);
    }

    @Test
    @DisplayName("Проверка палиндрома с пробелами")
    void palindromeWithSpaces() {
        boolean result = isPalindrome("a  aab a aa");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Проверка палиндрома с регистром")
    void palindromeWithRegistr() {
        boolean result = isPalindrome("AaabaAa");
        Assertions.assertTrue(result);
    }
}
