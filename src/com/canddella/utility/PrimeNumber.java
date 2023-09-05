package com.canddella.utility;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		boolean numberCheck = numberCheck(number);
		if (numberCheck)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Composite Number");
		}

	}

	private static boolean numberCheck(int number) {
		if (number == 1) {
			System.out.println("Prime nor Composite Number");
			return (Boolean) null;
          //  return false; // Numbers less than or equal to 1 are not prime
        }
        
        if (number <= 3) {
            return true; // 2 and 3 are prime
        }
        if (number==4)
        {
        	return false;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Numbers divisible by (i) or (i + 2) are not prime
            }
        }

        return true;
	}

}
