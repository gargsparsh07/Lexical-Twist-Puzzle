package com.lexical;

import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println("Error: Please enter single words only.");
            return;
        }

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
                System.out.println("More Vowels");
            } else if (consonants > vowels) {
                System.out.println("More Consonants");
            } else {
                System.out.println("Vowels and Consonants are Equal");
            }

        }

        scanner.close();

    }
}