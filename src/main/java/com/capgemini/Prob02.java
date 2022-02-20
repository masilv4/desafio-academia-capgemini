package com.capgemini;

import java.util.Arrays;

public class Prob02 {

    public static int checkPassword(String password) {
        int result = 0;
        int passwordSize = password.length();
        String[] symbols = new String[] {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};

        if (password.chars().noneMatch(Character::isUpperCase)) {
            result += 1;
        }

        if (password.chars().noneMatch(Character::isLowerCase)) {
            result += 1;
        }

        if (password.chars().noneMatch(Character::isDigit)) {
            result += 1;
        }

        boolean hasSymbol = Arrays.stream(symbols)
                .anyMatch(symbol -> password.contains(symbol));

        if (!hasSymbol) {
            result += 1;
        }

        int newPasswordSize = passwordSize + result;

        if (newPasswordSize < 6) {
            result += 6 - newPasswordSize;
        }

        return result;
    }
}
