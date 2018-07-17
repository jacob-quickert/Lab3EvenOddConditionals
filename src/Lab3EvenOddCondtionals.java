import java.util.Scanner;

public class Lab3EvenOddCondtionals {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Please enter a number between 1 and 100: ");
		int userNum = scan.nextInt();
		
		
		if (userNum >= 1 && userNum <= 100) {
			if (userNum % 2 != 0 && userNum > 60) {
				System.out.println(name + " your number is " + userNum);
				System.out.println("Odd and over 60");
			} else if (userNum % 2 == 0 && userNum < 26) {
				System.out.println(name + " your number is even and less than 25");
			} else if (userNum % 2 == 0 && userNum < 61) {
				System.out.println(name + " your number is even");
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println(name + " your number is " + userNum);
				System.out.println("Even");
			} else {
				System.out.println(name + " your number is " + userNum);
				System.out.println("Odd");
			}

		} else {
			System.out.println("Number is out of range - please enter a value between 0 and 100");
		}
		
		System.out.println("");
		System.out.println("Goodbye " + name + ".");
		
		scan.close();
	}
}
