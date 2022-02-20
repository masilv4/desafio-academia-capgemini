package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prob02Test {

    @Test
    public void whenMissing1LowercaseCharThenCount1MissingChar() {
        String password = "JSA7782@#45!@3";

        int count = Prob02.checkPassword(password);

        assertEquals(1, count);
    }

    @Test
    public void whenMissing1UppercaseCharThenCount1MissingChar() {
        String password = "7f6d6f7g#2#$&2";

        int count = Prob02.checkPassword(password);

        assertEquals(1, count);
    }

    @Test
    public void whenMissing1DigitThenCount1MissingDigit() {
        String password = "fdSdaSDJFA@$#fd";

        int count = Prob02.checkPassword(password);

        assertEquals(1, count);
    }

    @Test
    public void whenMissing1SymbolCharThenCount1MissingChar() {
        String password = "sdgsdAJ32";

        int count = Prob02.checkPassword(password);

        assertEquals(1, count);
    }

    @Test
    public void whenPasswordLessThan6CharsThenCountMissingChars() {
        String password = "Ya3@";

        int count = Prob02.checkPassword(password);

        assertEquals(2, count);
    }
}
