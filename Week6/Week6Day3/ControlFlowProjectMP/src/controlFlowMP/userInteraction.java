package controlFlowMP;

import java.util.ArrayList;
import java.util.Scanner;

public class userInteraction {
//	public static string userName;
	public static ArrayList<Integer> answer1 = new ArrayList<Integer>();
	public static ArrayList<String> answer2 = new ArrayList<String>();

	static Scanner scanner = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		userResponsive();
//		userQuestionaire();
//		lottoNums();
	}

	public static void userResponsive() {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter your name: ");
			String userName = scanner.next();// Requests a string and hit enter
			System.out.println("Hello, " + userName + "!");
			System.out.println("Do you wish to continue to the interactive portion?");
			System.out.println("To continue, type 'y' for yes.");
			System.out.println("To exit this program, type 'n'");
			String userCont = scanner.next();

			// TODO: Questionare Section
			if (userCont.equalsIgnoreCase("y")) {
				userQuestionaire();
			} else if (userCont.equalsIgnoreCase("n")) {
				System.out.println("Please return later to complete the survey");
				System.out.println("Goodbye!");
			}
		}
//			else {System.out.println("Please only enter a Y or an N!";}
		finally {
			if (scanner != null)
				scanner.close();
		}

	}

	public static void userQuestionaire() {
//		System console = System.out;
		Scanner qScan = new Scanner(System.in);

		System.out.println("Welcome! Be sure to answer your answer as the questions instruct you to do so!");
		System.out.println();
//	Use a loop to repeatedly ask the user some questions. What will be done is to gather some random information from the user and then generate their potential winning Powerball numbers.  At the end, ask them if they would like to generate another set of numbers.  Note that it may be helpful to put example responses after each question.  

//	Questions for the survey:
		String q0 = "What is the age of your pet? (numerical inputs only, 0-9)";//
		String q1 = "Lucky number? (numerical inputs only, 0-9)";
		String q2 = "Favorite QB jersey number? If none then enter 0 (numerical inputs only, 0-9)";
		String q3 = "What is two-digit model year of your car? (numerical inputs only, 0-9)";
		String q4 = "Enter a random number between 1 and 50.(numerical inputs only, 0-9)";
		String q5 = "Do you have a red car? Yes or No? (alphabetic inputs)";
		String q6 = "What is the name of your favorite pet? (alphabetic inputs)";
		String q7 = "Name of the your favorite actor or actress? (alphabetic inputs)";
		String[] question1 = { q0, q1, q2, q3, q4, q5, q6, q7 };

		for (int i = 0; i < 5; i++) { // loops through question[] up to q5 where the answers become strings and adds
										// user repsonse to int answer1[]
			System.out.println(question1[i]);
			int a = qScan.nextInt();
			answer1.add(i, a);
		}
//		System.out.println(answer1); // loops through question[] from q5 - q7 and add the strings responses string
		// answer2[]
		for (int i = 5; i < question1.length; i++) {
			System.out.println(question1[i]);
			String a = qScan.next();
			int j = i - 5;
			answer2.add(j, a);
		}

		System.out.println("\n\nThanks for completing the survey!\n\n");
		System.out.println("To show our gratitude, please consider these\n lottery numbers");
		lottoNums();
	}

	public static void lottoNums() {

//		Random Number 1,2,& 3
		int min = 1;
		int max = 65;

		// Generates random intMB value from 1 to 75
//		System.out.println("Random lotto multiplier ints from " + min + " to " + max + ":");
		int randomLotto_1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
		int randomLotto_2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
		int randomLotto_3 = (int) Math.floor(Math.random() * (max - min + 1) + min);

//		Magic Ball!
		int minMB = 1;
		int maxMB = 75;
		int mB = (int) Math.floor(Math.random() * (maxMB - minMB + 1) + minMB);// Generates random intMB
		// generate value from 1 to 75
//		
//		magicBall: 1-75 and; randomNum*q4 or q7. If its greater than 75--> subtract 75
//		System.out.println(answer1.get(3));
		if (answer1.get(2) == 0) { // checks if fav. quarterback value is set to 0
			int mBUserInput = answer1.get(1); // gets answer for lucky number if quarterback value was set to 0

			mB = mBUserInput * mB;
		} else {
			int mBUserInput = answer1.get(2); // gets QB jersey number
			mB = mBUserInput * mB; // user input*
		}
		while (mB > maxMB) {
			mB = mB - maxMB;
		}

//		LottoNum1
//		* Use the two digit model year of their car and add their lucky number to it.
		int twoDigitModel = answer1.get(3);
		int luckyNum = answer1.get(1);
		int lN1 = twoDigitModel + luckyNum;
		if (lN1 > max) {
			lN1 = lN1 - max;
		}

//		lottoNum2
//		* Use the random number between 1 and 50, subtracting one of the generated random numbers.
		int randomNum = answer1.get(4);
		int Subtractor = randomLotto_1;
		int lN2 = randomNum - Subtractor;
		if (lN2 > max) {
			lN2 = lN2 - max;
		} else {
			while (lN2 < min) {
				lN2 = lN2 + randomLotto_1 / 11;
			}

//lottoNum3
//		* Use the value 42.
			int lN3 = 42;
//		lottoNum4
//		* Use the age of their favorite pet + their car model year.
			int ageOPet = answer1.get(0);
			int lN4 = twoDigitModel + ageOPet;
			if (lN4 > max) {
				lN4 = lN4 - max;
			}

// 		lottoNum5
//	* Favorite QB number + age of pet + lucky number.
			int qB = answer1.get(2);
			int lN5 = qB + ageOPet + luckyNum;
			if (lN5 > max) {
				lN5 = lN5 - max;
			}
			System.out.println(": " + lN1 + "," + lN2 + "," + lN3 + "," + lN4 + "," + lN5 + " Magic Ball: " + mB);
			goAgain();

		}
	}

	public static void goAgain() {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Go again?\n");
			System.out.println("Enter 'y' for to continue \nEnter 'n' to exit the program.");
			String again = scanner.next();
//If user answers y--> questions; no--> end program
			if (again.equalsIgnoreCase("y")) {
				userQuestionaire();
			} else if (again.equalsIgnoreCase("n")) {
				System.out.println("Please return later to complete the survey");
				System.out.println("Goodbye!");
			}
		}
//			else {System.out.println("Please only enter a Y or an N!";}
		finally {
			if (scanner != null)
				scanner.close();
		}

	}
//	public static void goAgain() {
//		System.out.println("Want more lucky numbers?");
//		System.out.println("Be sure to answer your answer as the questions instruct you to do so!");
//	}
}
// Bill y	4 49 0 18 49 	no petey Ben

//	
//