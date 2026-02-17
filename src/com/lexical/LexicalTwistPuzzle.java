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

        WordValidator validator = new WordValidator();
        if (!validator.validate(word1, word2)) {
            scanner.close();
            return;
        }

        LexicalAnalyzer analyzer = new LexicalAnalyzer();
        analyzer.analyze(word1, word2);

        scanner.close();
    }
}