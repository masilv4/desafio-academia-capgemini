package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prob03Test {

    @Test
    public void countSubstringsAnagramsOfString() {
        String str = "ifailuhkqq";

        int count = Prob03.countSubstringPairsAnagrams(str);

        assertEquals(3, count);
    }
}
