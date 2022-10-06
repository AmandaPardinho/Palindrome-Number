package palindrome;

import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {

		Integer x;
		//int digitNumber = [1, 2, 3, 4];
		boolean isAPalindrome;
		//String sizeChosenNumber;


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		x = scanner.nextInt();

		String digitNumber = Integer.toString(x);
		digitNumber = scanner.next();
		//System.out.println(digit.length());

		if(digitNumber == 1){
			isAPalindrome = true;
			System.out.println("The number is a palindrome");
		}else if(digitNumber == 2){
			if(digitPositionOne == digitPositionTwo){
				isPalindrome = true;
				System.out.println("The number is a palindrome");
			}else{
				System.out.println("The number isn't a palindrome.");
			}
		}else if(digitNumber == 3) {
			if(digitPositionOne != digitPositionTwo && digitPositionTwo != digitPositionThree
					&& digitPositionOne == digitPositionThree){
				isPalindrome = true;
				System.out.println("The number is a palindrome");
			}else{
				System.out.println("The number isn't a palindrome.");
			}
		}else if(digitNumber == 4) {
			if(digitPositionOne != digitPositionTwo && digitPositionTwo == digitPositionThree
					&& digitPositionThree != digitPositionFour && digitPositionOne == digitPositionThree){
				isPalindrome = true;
				System.out.println("The number is a palindrome");
			}else{
				System.out.println("The number isn't a palindrome.");
			}
		}
	}
}
