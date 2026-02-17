Lexical Twist Puzzle
Use Case–Driven Modular Java Project
Project Overview

The Lexical Twist Puzzle is a console-based Java application developed using a progressive Use Case–Driven approach.

The project demonstrates:

Modular programming principles

Object-Oriented Programming (OOPS) design

Clean separation of concerns

Step-by-step feature enhancement

Each use case builds logically on the previous one to create a fully functional puzzle system.

Use Case Implementation
UC1: Display Puzzle Title

Ability to display a static application title:
"Lexical Twist Puzzle"

UC2: Accept Word Inputs

Ability to accept two words from the user via console input.

UC3: Validate Single Word Constraint

Ability to validate that each input contains only one word.
If invalid, the program terminates gracefully with an appropriate message.

UC4: Check Reverse Relationship

Ability to check whether the second word is the reverse of the first word (case-insensitive).

UC5: Transform Word if Reverse Match

If the words are reverse matches:

Reverse the first word

Convert it to lowercase

Replace all vowels with @

Display the transformed output

UC6: Combine Words if Not Reverse

If the words are not reverse matches:

Combine both words

Convert the result to uppercase

Count vowels and consonants

UC7: Output Based on Vowel–Consonant Count

Based on the comparison:

If vowels > consonants → Print first 2 unique vowels

If consonants > vowels → Print first 2 unique consonants

If equal → Print equality message

UC8: Fully Modular OOPS Puzzle System

Implementation follows a clean modular architecture:

LexicalTwistPuzzle → User Interface (UI Layer)

LexicalAnalyzer → Core Logic Layer

WordValidator → Validation Layer

This ensures maintainability, scalability, and strong separation of responsibilities.

How to Run the Project

Compile the program:
javac LexicalTwistPuzzle.java

Run the program:
java LexicalTwistPuzzle


Key Highlights

Progressive use case development

Clean OOPS-based modular structure

Strong validation and logic separation

Clear transformation and comparison rules

Console-based interactive execution

This project serves as a strong demonstration of structured Java application development using modular design principles.
