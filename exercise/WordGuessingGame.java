package exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    public static String selectRandomWord() {
        String[] words = {"apple",  "banana",  "cherry",  "dog",  "elephant",  "forest",  "grape",  "house",  "island",  "jungle"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

    public static String hideWord(String word) {
        char[] hiddenWord = new char[word.length()];
        Arrays.fill(hiddenWord, '_');
        return new String(hiddenWord);
    }

    public static char getPlayerGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guessed word: ");
        String input = scanner.nextLine();
        return (input.isEmpty()) ? '\0' : input.charAt(0);
    }

    public static boolean isGuessCorrect(String word, char guess) {
        return word.toUpperCase().contains(Character.toString(guess).toUpperCase());
    }

    public static String updateHiddenWord (String word, String hiddenWord, char guess) {
        if (isGuessCorrect(word, guess)) {
            StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);
            for (int i = 0; i < word.length(); i++) {
                if (Character.toUpperCase(word.charAt(i)) == Character.toUpperCase(guess)) {
                    updatedHiddenWord.setCharAt(i, Character.toUpperCase(guess));
                }
            }
            return updatedHiddenWord.toString();
        } else {
            return hiddenWord;
        }
    }

    public static void displayGameResult (String wordToGuess, String hiddenWord, int attemptsLeft) {
        if (attemptsLeft > 0) {
            System.out.println("CONGRATULATION!");
            System.out.println("YOU WIN!");

        } else {
            System.out.println("YOU LOSE!");
            System.out.println("Word to guess: " + wordToGuess.toUpperCase());
        }
        System.out.println("Your guessed word: " + hiddenWord);
        System.out.println("Attempts left: " + attemptsLeft);
    }

    public static void runGame() {
        System.out.println("WELCOME!");

        int attempts = 6;
        boolean isComplete = false;

        String randomWord = selectRandomWord();
        String hiddenWord = hideWord(randomWord);

        while (!isComplete) {
            System.out.println("Guess the word: " + hiddenWord);
            System.out.println("Attempts left: " + attempts);

            char guess = getPlayerGuess();
            if (guess == '\0') {
                System.out.println("Invalid input. Please enter a single letter!");
                continue;
            }

            if (isGuessCorrect(randomWord, guess)) {
                String tempHiddenWord = updateHiddenWord(randomWord, hiddenWord, guess);

                if (!hiddenWord.equals(tempHiddenWord)) {
                    hiddenWord = tempHiddenWord;
                }
                if (hiddenWord.equals(randomWord.toUpperCase())) {
                    isComplete = true;
                }
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong Guess!");
                attempts--;
                if (attempts == 0) {
                    isComplete = true;
                }
            }
            System.out.println();
        }
        displayGameResult(randomWord, hiddenWord, attempts);
    }
}