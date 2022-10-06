package palindrome;

import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {

		Integer x;
		Integer digitPositionOne = null;
		Integer digitPositionTwo = null;
		Integer digitPositionThree = null;
		Integer digitPositionFour = null;
		int numeral = 0;
		boolean isAPalindrome;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		x = scanner.nextInt();

		String digitNumber = Integer.toString(x);
		digitNumber = scanner.next();
		numeral = Integer.parseInt(digitNumber);
		//System.out.println(digitNumber.length());

		if(numeral == 1){
			isAPalindrome = true;
			System.out.println("The number is a palindrome");
		}

		if(numeral == 2 && digitPositionOne == digitPositionTwo && digitPositionOne != 0){
			isAPalindrome = true;
			System.out.println("The number is a palindrome");
		}else{
			if(numeral == 3 && digitPositionOne != digitPositionTwo && digitPositionTwo != digitPositionThree
					&& digitPositionOne == digitPositionThree && digitPositionOne != 0){
				isAPalindrome = true;
				System.out.println("The number is a palindrome");
			}else{
				if(numeral == 4 && digitPositionOne != digitPositionTwo && digitPositionTwo == digitPositionThree
						&& digitPositionThree != digitPositionFour && digitPositionOne == digitPositionThree
						&& digitPositionOne != 0){
					isAPalindrome = true;
					System.out.println("The number is a palindrome");
				}else{
					System.out.println("The number isn't a palindrome.");
				}
			}
		}
	}
}

