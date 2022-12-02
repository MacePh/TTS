package controlFlowMP;

public class AsciiChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers();
		printLowerCase();
		printUpperCase();
	}

	public static void printNumbers() // Prints all valid numbers using for statement from ASCII chart.
	{
		// TODO: print valid numeric input
		System.out.println("Valid Numberic Inputs:");
		for (char i = 48; i < 58; i++) {
			System.out.print((char) i);
		}
		System.out.println();
		// Output:
		// 0123456789
	}

	public static void printLowerCase() // Prints all valid lowercase letters from ASCII chart.
	{
		// TODO: print valid lowercase alphabetic input
		System.out.println("Valid lowercase alphabetic inputs:");
		for (char i = 97; i < 123; i++) {
			System.out.print((char) i);
		}
		System.out.println();
		// Output:
		// abcdefghijklmnopqrstuvwxyz
	}

	public static void printUpperCase() // Prints all valid UPPERcase letters numbers using for statement from ASCII
										// chart.
	{
		// TODO: print valid uppercase alphabetic input
		System.out.println("Valid UPPERCASE alphabetic inputs:");
		for (char i = 65; i < 91; i++) {
			System.out.print((char) i);
		}
		System.out.println();
		// Output:
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
	}
}

//	 String input = "java is best";
//     System.out.println("Lower case string is : " + input);
//     char strArr[] = input.toCharArray();
//     for (int i = 0; i < strArr.length; i++) {
//             // here is the actual logic
//             if (strArr[i] >= 'a' && strArr[i] <= 'z') {
//                     strArr[i] = (char) ((int) strArr[i] - 32);

//	System.out.print("Upper case string is : ");
//    // print the string array
//    for (int i = 0; i < strArr.length; i++) {
//            System.out.print(strArr[i]);