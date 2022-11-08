package palindrome.newsolution;

import java.util.Scanner;

public class NewSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                  Given an integer x, where 1 <= x <= 9999, if true you must return x
                  is palindrome integer or if false it's not a palindrome integer. 
                """);

        String newNumberX;

        System.out.println("Enter a number:");
        Integer numberX = scanner.nextInt();

        if(numberX >= 1 && numberX <= 9999) {
            newNumberX = Integer.toString(numberX);
            StringBuilder b = new StringBuilder(newNumberX);
            boolean isPalindrome = (b.reverse().toString().equals(newNumberX));

            if (isPalindrome == true) {
                System.out.println("The number is a palindrome");
            } else {
                System.out.println("The number isn't a palindrome");
            }
        }else{
            System.out.println("This number is not allowed. Start again.");
        }

        scanner.close();
    }
}
