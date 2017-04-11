/**
 *
 */
package adder;

import java.util.Scanner;

/**
 * @author Saif_sust_2013331007
 *
 */
public class adder {

	/**
	 * @param args
	 */

	public static String addBigNumber(String firstNumber, String secondNumber) {
		String strNumber = "";
		int maxLength = 0;
		if (firstNumber.length() > secondNumber.length()) {
			maxLength = firstNumber.length();
		} else {
			maxLength = secondNumber.length();
			String temp = "";
			temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}
		int i, j, carry = 0;
		for (i = maxLength - 1, j = secondNumber.length() - 1;; i--, j--) {

			// System.out.println("Okay Done");
			if (i < 0 && j < 0 && carry == 0)
				break;
			else {
				if (j < 0 && i >= 0) {
					if (carry > 0) {
						int sum = firstNumber.charAt(i) - '0' + carry;
						if (sum > 9) {
							strNumber += sum % 10;
							carry = sum / 10;
						} else {
							strNumber += sum;
							carry = 0;
						}
					} else {
						if (i >= 0 && j < 0 && carry == 0) {
							strNumber += firstNumber.charAt(i);
						}
					}
				} else {
					if (i >= 0 && j >= 0) {
						int sum = firstNumber.charAt(i) - '0' + secondNumber.charAt(j) - '0' + carry;
						if (sum > 9) {
							strNumber += sum % 10;
							carry = sum / 10;
						} else {
							strNumber += sum;
							carry = 0;
						}
					} else {
						if (carry > 0) {
							strNumber += carry;
							carry=0;
						}
					}
				}
			}

		}

		return Reverse(strNumber);
	}

	public static String Reverse(String strNumber) {
		String str = "";
		for (int i = strNumber.length() - 1; i >= 0; i--) {
			str += strNumber.charAt(i);
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(addBigNumber("9", "9"));
		Scanner scanner = new Scanner(System.in);
		String str, str2;
		/*
		 * while (scanner.hasNext()) { str = scanner.nextLine(); str2 =
		 * scanner.nextLine(); System.out.println(addBigNumber(str, str2)); }
		 */

	}

}
