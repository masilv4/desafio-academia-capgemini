package com.capgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prob03 {

    public static int countSubstringPairsAnagrams(String str) {
        Map<String, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                char[] substringChars = substring.toCharArray();
                Arrays.sort(substringChars);
                String sortedSubstring = new String(substringChars);
                frequencies.merge(sortedSubstring, 1, Integer::sum);
            }
        }

        return frequencies.values()
                .stream()
                .reduce(0, (subtotal, frequency) -> subtotal + (frequency * (frequency - 1)) / 2);
    }
}
