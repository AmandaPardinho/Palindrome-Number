package palindrome.anothersolution;

import java.util.Scanner;

public class AnotherSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                  Given an integer x, where 1 <= x <= 9999, if true you must return x
                  is palindrome integer or if false it's not a palindrome integer. 
                """);

        int number;
        int divByHundred;
        int divByTen;
        int unit;
        int rest;
        int newNumber;
        boolean isPalindrome = false;

        System.out.println("Enter a number:");
        number = scanner.nextInt();

        divByHundred = number / 100;
        rest = number % 100;
        divByTen = rest / 10;
        unit = rest % 10;

        newNumber = (unit * 100) + (divByTen * 10) + divByHundred;

        if(isPalindrome == true){
            number = newNumber;
            System.out.println("The number is a palindrome.");
        }else{
            System.out.println("It's not a palindrome.");
        }

        scanner.close();
    }
}
