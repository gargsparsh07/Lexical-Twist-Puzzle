package com.lexical;

public class WordValidator {
    public boolean validate(String word1, String word2) {
        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println("Error: Please enter single words only.");
            return false;
        }
        return true;
    }
}
