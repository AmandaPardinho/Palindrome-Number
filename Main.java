package palindrome;

import java.util.*;


public class Main{

	public static void main(String[] args) {

		Integer xNumber;
		Integer digitPositionOne = null; //first position from right to left (u)
		Integer digitPositionTwo = null; //second position from right to left (d)
		Integer digitPositionThree = null; //third position from right to left (c)
		Integer digitPositionFour = null; //fourth position from right to left (m)
		int numeral;
		boolean isAPalindrome;
		Integer [] array = {digitPositionFour, digitPositionThree, digitPositionTwo, digitPositionOne}

		Scanner scanner = new Scanner(System.in);

		System.out.println("""
		  Given an integer x, where 1 <= x <= 9999, if true you must return x
		  is palindrome integer or if false it's not a palindrome integer. 
		""");

		System.out.println("Enter a number: ");
		xNumber = scanner.nextInt();

		String digitNumber = Integer.toString(xNumber);
		//digitNumber = scanner.next();
		//System.out.println(digitNumber.length());
		numeral = Integer.parseInt(digitNumber);
        System.out.println(numeral);

		if(numeral == 1){
			if(digitPositionOne != 0){
				System.out.println("The number is a palindrome");
			}
		}

		if(numeral == 2){
			if(digitPositionOne == digitPositionTwo){
				System.out.println("The number is a palindrome");
			}else{
				System.out.println("The number isn't a palindrome.");
			}
		}

		if(numeral == 3){
			if(digitPositionOne == digitPositionTwo && digitPositionTwo == digitPositionThree){
				System.out.println("The number is a palindrome");
			}else if(digitPositionOne != digitPositionTwo && digitPositionTwo != digitPositionThree
					&& digitPositionOne == digitPositionThree && digitPositionThree != 0) {
				System.out.println("The number is a palindrome");
			}else{
				System.out.println("The number isn't a palindrome.");
			}
		}

		if(numeral == 4){
			if((digitPositionOne == digitPositionTwo && digitPositionTwo == digitPositionThree &&
			digitPositionThree == digitPositionFour) || (digitPositionOne != digitPositionTwo && digitPositionTwo == digitPositionThree
					&& digitPositionThree != digitPositionFour && digitPositionOne == digitPositionFour
					&& digitPositionOne != 0)){
				System.out.println("The number is a palindrome");
			}else{
				System.out.println("The number isn't a palindrome.");
			}
		}

		if(numeral == 0 || numeral < 0 || numeral > 4){
			System.out.println("Number not allowed.");
		}
	}
}

