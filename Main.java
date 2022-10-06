package palindrome;

import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {

		Integer x;
		//int digitNumber = [1, 2, 3, 4];
		boolean isPalindrome;
		//String sizeChosenNumber;


		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter a number: ");
		x = scanner.nextInt();

		String digitNumber = Integer.toString(x);
		digitNumber = scanner.next();
		//System.out.println(digit.length());

		if(digitNumber == String.valueOf(1)){
			isPalindrome = true;
			System.out.println("The number is a palindrome");
		}

			/*case 2:
				if(digitNumber = String.valueOf(2)){
					isPalindrome = true;
				}

			case 3:
				digitNumber = String.valueOf(3);
				break;
			case 4:
				digitNumber = String.valueOf(4);
				break;
			default:
				digitNumber = String.valueOf(null);
				System.out.println("Not allowed");*/
	}
}
