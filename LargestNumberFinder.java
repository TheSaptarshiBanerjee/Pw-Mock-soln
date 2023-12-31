// Write a Java program to find the largest of three numbers using nested if-else statements.

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int largestNumber;

        if (number1 > number2) {
            if (number1 > number3) {
                largestNumber = number1;
            } else {
                largestNumber = number3;
            }
        } else {
            if (number2 > number3) {
                largestNumber = number2;
            } else {
                largestNumber = number3;
            }
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}
