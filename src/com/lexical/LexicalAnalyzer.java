package com.lexical;

public class LexicalAnalyzer {
    public void analyze(String word1, String word2) {
        String reverseWord1 = new StringBuilder(word1).reverse().toString();

        if (word2.equalsIgnoreCase(reverseWord1)) {
            System.out.println(word2 + " is the reverse of " + word1);

            String transformed = reverseWord1.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println("Transformed: " + transformed);
        } else {
            System.out.println(word2 + " is NOT the reverse of " + word1);

            String combined = (word1 + word2).toUpperCase();
            System.out.println("Combined: " + combined);

            int vowels = 0, consonants = 0;
            for (char c : combined.toCharArray()) {
                if ("AEIOU".indexOf(c) != -1)
                    vowels++;
                else if (Character.isLetter(c))
                    consonants++;
            }

            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

            if (vowels > consonants) {
                System.out.print("First 2 unique vowels: ");
                printUniqueChars(combined, "AEIOU", 2);
            } else if (consonants > vowels) {
                System.out.print("First 2 unique consonants: ");
                printUniqueChars(combined, "BCDFGHJKLMNPQRSTVWXYZ", 2);
            } else {
                System.out.println("No Lexical Twist Possible: Vowels and Consonants are equal.");
            }
        }
    }

    private void printUniqueChars(String str, String filter, int count) {
        StringBuilder unique = new StringBuilder();
        int found = 0;

        for (char c : str.toCharArray()) {
            if (filter.indexOf(c) != -1 && unique.indexOf(String.valueOf(c)) == -1) {
                unique.append(c);
                System.out.print(c + " ");
                found++;
                if (found == count)
                    break;
            }
        }
        System.out.println();
    }
}