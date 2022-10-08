package palindrome;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer xNumber;
        Integer digits;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                  Given an integer x, where 1 <= x <= 9999, if true you must return x
                  is palindrome integer or if false it's not a palindrome integer. 
                """);

        do {
            System.out.println("Enter a number: ");
            xNumber = scanner.nextInt();

            String digitNumber = Integer.toString(xNumber);
            digits = digitNumber.length();

            List<Integer> digit = new ArrayList<>();
            for (int i = 0; i < digitNumber.length(); i++) {
                digit.add((int) digitNumber.charAt(i));
            }

            switch (digits) {
                case 1:
                    if (xNumber > 0) {
                        System.out.println("The number is a palindrome");
                    } else {

                        System.out.println("Number not allowed.");
                    }
                    break;
                case 2:
                    if (digit.get(0).equals(digit.get(1))) {
                        System.out.println("The number is a palindrome");
                    } else {
                        System.out.println("The number isn't a palindrome.");
                    }
                    break;
                case 3:
                    if ((digit.get(0).equals(digit.get(1)) && digit.get(1).equals(digit.get(2))) || (digit.get(0).equals(digit.get(2)))) {
                        System.out.println("The number is a palindrome");
                    } else {
                        System.out.println("The number isn't a palindrome.");
                    }
                    break;
                case 4:
                    if ((digit.get(0).equals(digit.get(1)) && (digit.get(1).equals(digit.get(2)) && (digit.get(2).equals(digit.get(3))) ||
                            (digit.get(0).equals(digit.get(3)) && (digit.get(1).equals(digit.get(2))))))) {
                        System.out.println("The number is a palindrome");
                    } else {
                        System.out.println("The number isn't a palindrome.");
                    }
                    break;
                default:
                    System.out.println("Number not allowed.");
            }
        } while (xNumber <= 0 || xNumber > 9999);
    }
}

