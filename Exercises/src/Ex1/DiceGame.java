package Ex1;

public class DiceGame {
	public static void main(String[]args) {
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
			System.out.println("You Won!");
		}
		else {
			System.out.println("You Lost.");
		}
	}
}