package palindrome;

import java.util.*;


public class Main{

	public static void main(String[] args) {

		Integer xNumber;
		Integer digitPositionOne = null;
		Integer digitPositionTwo = null;
		Integer digitPositionThree = null;
		Integer digitPositionFour = null;
		int numeral;
		boolean isAPalindrome;

		Scanner scanner = new Scanner(System.in);

		System.out.println("""
		  Given an integer x, where 1 <= x <= 9999, if true you must return x 
		  is palindrome integer or if false it's not a palindrome integer. 
		""");

		System.out.println("Enter a number: ");
		xNumber = scanner.nextInt();

		String digitNumber = Integer.toString(xNumber);
		//digitNumber = scanner.next();
		System.out.println(digitNumber.length());
		numeral = Integer.parseInt(digitNumber);
        System.out.println(numeral);

		/*switch(numeral){
			case 1:
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
				if(digitPositionOne == digitPositionTwo == digitPositionThree){
					//isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else if(digitPositionOne != digitPositionTwo && digitPositionTwo != digitPositionThree
						&& digitPositionOne == digitPositionThree && digitPositionOne != 0){
					//isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else{
					System.out.println("The number isn't a palindrome.");
				}
				break;
			case 4:
				if(digitPositionOne == digitPositionTwo == digitPositionThree == digitPositionFour){
					//isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else if(digitPositionOne != digitPositionTwo && digitPositionTwo == digitPositionThree
						&& digitPositionThree != digitPositionFour && digitPositionOne == digitPositionFour
						&& digitPositionOne != 0) {
					//isAPalindrome = true;
					System.out.println("The number is a palindrome");
				} else {
					System.out.println("The number isn't a palindrome.");
				}
				break;
			default: System.out.println ("Not allowed.");
		}*/
	}
}

