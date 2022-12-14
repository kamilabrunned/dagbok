package org.dagbok;

import java.util.Scanner;

public class Main {

	/**
	 * Main method is where code is run, it has a welcome message and runs the main menu method
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to the diary you will now have three options with what you can do in your diary");

		goToMainMenu();
	}

	/**
	 * Main menu method handles the whole diary, it gives the user 3 options to choose from, create and show posts and also close the program
	 */

	public static void goToMainMenu() {
		System.out.println("1: Create a new post");
		System.out.println("2: Show posts");
		System.out.println("3: Exit the program");

		Scanner scanner = new Scanner(System.in);

		switch (scanner.nextInt()) {
			case 1 -> {
				PostManager.createPost(scanner);
				goToMainMenu();
			}
			case 2 -> PostManager.readPosts(scanner);
			case 3 -> Main.shutDown();
		}
	}

	/**
	 * Shutdown method closes the program
	 */
	private static void shutDown() {
		System.out.println("Good bye");
		System.exit(0);
	}
}