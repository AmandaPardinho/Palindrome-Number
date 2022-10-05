package palindrome;

import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {

		int x;
		//int digitNumber = [1, 2, 3, 4];
		boolean isPalindrome;


		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter a number: ");
		x = scanner.nextInt();

		String string = Integer.toString(x);
		System.out.println(string.length());

		/*switch (number){
			case 1:
				a = x = a;
				digitNumber = 1;
				break;
			case 2:
				ab = x = ba;
				digitNumber = 2;
				isPalindrome = true;
			case 3:
				abc = x = cba;
				digitNumber = 3;
				break;
			case 4:
				abcd = x = dcba;
				digitNumber = 4;
				break;
			default: "Number not allowed";
		}*/
		
	}

}
