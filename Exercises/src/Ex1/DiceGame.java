package Ex1;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[]args) {
		//Outputs: Hello, 'name'!
		System.out.println("What is your name?");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.printf("Hello, %s!\n\n", name);
		s.close();
		
		//Dice Game
		System.out.println("rolling dice..");
		int max = 6;
		int min = 1;
		int die1 = (int)Math.floor(Math.random()* (max - min) + min);
		int die2 = (int)Math.floor(Math.random()* (max - min) + min);
		System.out.println("Die 1: " + die1);
		int total = die1 + die2;
		System.out.println("Die 2: " + die2);
		System.out.println("Total value: " + (total));
		if(total > 7) {
			System.out.printf("%s Won!\n", name);
		}
		else {
			System.out.printf("%s Lost.\n", name);
		}
	}
}