package controlFlowMP;

import java.util.Scanner;

//import java.util.Scanner;
static Scanner scanner = null;
public class Test {

	public static void main(String[] args) {
		randomNumbersHowto();
		userChoices();
	}
//	System.out.println(random_int);

	public static void randomNumbersHowto() {
		int min = 1;
		int max = 3;

		// Generate random int value from 50 to 100
		System.out.println("Random value in int from " + min + " to " + max + ":");
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println(random_int);
	}

	public static void userChoices() {
		
		try {
			scanner = new Scanner(System.in);

			String choice = scanner.next();

			if (choice.equals("1")) {
				System.out.println(" you chose number 1,silly!");
			} else if (choice.equals("2")) {
				System.out.println(" you chose number 2!");
			} else if (choice.equals("3")) {
				System.out.println(" you chose number 3!");
			} else if (choice.equalsIgnoreCase("q")) {
				System.out.println("the game will end now!");
				System.exit(0);
			}
		} finally {
			if (scanner != null)
				scanner.close();
		}
	}

////public static void magicBall() {
//	int minMB = 1;
//	int maxMB = 75;
//	int randomLotto_MB = (int) Math.floor(Math.random() * (maxMB - minMB + 1) + minMB);// Generates random intMB
//	// generate value from 1 to 75
////	
////	magicBall: 1-75 and; randomNum*q4 or q7. If its greater than 75--> subtract 75
////	System.out.println(answer1.get(3));
//	if (answer1.get(2) == 0) {
//		int mBUserInput = answer1.get(1);
//		int mBMultiplier = randomLotto_MB;
//		int mB = mBUserInput * mBMultiplier;
//	} else {
//		int mBUserInput = answer1.get(2);
//		int mBMultiplier = randomLotto_MB;
//		int mB = mBUserInput * mBMultiplier;
//	}
//	if (mB > maxMB) {
//		mB = mB - maxMB;
//	} else {
//		System.out.println(mB);
//	}
//	lottoNum1();
//}
	public static void randomNums() {
//		Random Number 1,2,& 3
		int min = 1;
		int max = 65;

		// Generates random intMB value from 1 to 75
//		System.out.println("Random lotto multiplier ints from " + min + " to " + max + ":");
		int randomLotto_1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
		int randomLotto_2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
		int randomLotto_3 = (int) Math.floor(Math.random() * (max - min + 1) + min);

//		System.out.println("#1:" + randomLotto_1);
//		System.out.println("#2:" + randomLotto_2);
//		System.out.println("#3:" + randomLotto_3);
	}
}
