package org.shabbydev.main.server.command.game;

public class PalindromeChecker {
    public boolean check(String palindrome) {
        char[] chars = palindrome.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == chars[(chars.length - 1) - i])
                continue;
            if(i > chars.length - i)
                break;

            return false;
        }

        return true;
    }

    public int getPoints(String message) {
        return message.length();
    }
}
