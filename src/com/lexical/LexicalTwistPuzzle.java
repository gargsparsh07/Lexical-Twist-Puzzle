package com.lexical;

import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        if (firstWord.contains(" ") || secondWord.contains(" ")) {
            System.out.println("Invalid word input");
            return;
        }

        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {
            System.out.println("Reverse Match");
        } else {
            System.out.println("Not Reverse");
        }

    }
}
