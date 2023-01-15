package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class MSchuster_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int remainingAttempts = 5;
		System.out.println("Guess a Number Between 1-100");
		System.out.println(randomNumber);
		while (remainingAttempts > 0) {
			remainingAttempts--;

			int playerGuess = scanner.nextInt();

			if (playerGuess < 1 || playerGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				remainingAttempts++;
			} else if (playerGuess < randomNumber) {
				System.out.println("Please Pick a Higher Number");
			} else if (playerGuess > randomNumber) {
				System.out.println("Please Pick a Lower Number");
			} else if (playerGuess == randomNumber) {
				System.out.println("You Win!");
				break;
			}
			if (remainingAttempts == 0 && playerGuess != randomNumber) {
				System.out.println("You lose!");
				System.out.println("The Number to guess was: " + randomNumber);
			}

		}

	}
}
