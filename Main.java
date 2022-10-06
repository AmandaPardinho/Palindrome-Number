package palindrome;

import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {

		Integer xNumber;
		Integer digitPositionOne = null;
		Integer digitPositionTwo = null;
		Integer digitPositionThree = null;
		Integer digitPositionFour = null;
		int numeral = 0;
		boolean isAPalindrome;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		xNumber = scanner.nextInt();

		String digitNumber = Integer.toString(xNumber);
		digitNumber = scanner.next();
		System.out.println(digitNumber.length());
		numeral = Integer.parseInt(digitNumber);

		/*switch(numeral){
			case 1:
				isAPalindrome = true;
				System.out.println("The number is a palindrome");
				break;
			case 2:
				if(digitPositionOne == digitPositionTwo && digitPositionOne != 0) {
					isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else{
					System.out.println("The number isn't a palindrome.");
				}
				break;
			case 3:
				if(digitPositionOne != digitPositionTwo && digitPositionTwo != digitPositionThree
						&& digitPositionOne == digitPositionThree && digitPositionOne != 0) {
					isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else{
					System.out.println("The number isn't a palindrome.");
				}
				break;
			case 4:
				if(digitPositionOne != digitPositionTwo && digitPositionTwo == digitPositionThree
						&& digitPositionThree != digitPositionFour && digitPositionOne == digitPositionThree
						&& digitPositionOne != 0){
					isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else {
					System.out.println("The number isn't a palindrome.");
				}
				break;
			default: System.out.println ("Not allowed.");
		}*/
	}
}

