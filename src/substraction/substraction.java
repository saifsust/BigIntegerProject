/**
 * 
 */
package substraction;

/**
 * @author Saif_sust_2013331007
 *
 */
public class substraction {

	/**
	 * @param args
	 */

	public static String substraction(String firstString, String secondString) {
		String str = "";
		if (IsGreater(firstString, secondString)) {
			return substract(firstString, secondString);
		} else {
			str = substract(secondString, firstString);
			if (str.equals("0")) {
				return "0";
			} else {
				return "-" + str;
			}
		}

	}

	public static boolean IsGreater(String str, String str2) {
		if (str.length() > str2.length()) {
			return true;
		} else {
			if (str.length() == str2.length()) {
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) - '0' > str2.charAt(i) - '0') {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static String substract(String str1, String str2) {
		String str3 = "";
		int carry = 0, sub = 0, dig = 0, dig2 = 0;
		for (int i = str1.length() - 1, j = str2.length() - 1; i >= -1; i--, j--) {
			if (i < 0 && j < 0 && carry == 0) {
				break;
			} else {
				if (i >= 0 && j < 0) {
					dig = str1.charAt(i) - '0';
					// System.out.println(dig+" "+carry);
					if (carry > 0) {
						if (dig >= carry) {
							sub = dig - carry;
							// System.out.println(sub);
							carry = 0;
							str3 += sub;
							// System.out.println(str3);
						} else {
							dig += 10;
							sub = dig - carry;
							carry = 1;
							str3 += sub;
						}

					} else {
						str3 += dig;
						carry = 0;
					}
				} else {
					if (i >= 0 && j >= 0) {
						dig2 = str1.charAt(i) - '0';
						dig = str2.charAt(j) - '0' + carry;
						// System.out.println(dig2+" "+dig);
						if (dig2 >= dig) {
							str3 += dig2 - dig;
							carry = 0;
						} else {
							dig2 += 10;
							str3 += dig2 - dig;
							carry = 1;
						}

					} else {

					}
				}

			}
		}
		str3 = adder.adder.Reverse(str3);
		return removeZero(str3);
	}

	private static String removeZero(String str) {
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - '0' > 0) {
				index = i;
				break;
			}
		}
		// System.out.println(index);
		return str.substring(index, str.length());
	}

	public static void main(String[] args) {
		// System.out.println(substract("6", "3"));
		//System.out.println(IsGreater("5", "50"));
		System.out.println(substraction("50", "5"));
	}

}
