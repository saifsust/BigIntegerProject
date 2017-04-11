/**
 * 
 */
package multiply;

/**
 * @author Saif_sust_2013331007
 *
 */
public class multiplier {

	/**
	 * @param args
	 */

	public static String multply(String str, String multiplier) {
		String answer = "", str3 = "", str2 = "", str4 = "";
		int carry = 0;
		answer = "0";
		for (int i = multiplier.length() - 1, k = 0; i >= 0; i--, k++) {
			str3 = "";
			carry = 0;
			for (int j = str.length() - 1; j >= -1; j--) {
				if (j < 0 && carry > 0) {
					str3 += carry;
				} else {
					if (j >= 0 && i >= 0) {
						int multi = (multiplier.charAt(i) - '0') * (str.charAt(j) - '0') + carry;
						if (multi > 9) {
							str3 += multi % 10;
							carry = multi / 10;
						} else {
							str3 += multi;
							carry = 0;
						}
					}
				}
			}
			str3 = adder.adder.Reverse(str3);
			for (int j = 0; j < k; j++) {
				str3 += "0";
			}
			answer = adder.adder.addBigNumber(str3, answer);
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(multply("10", "6"));
	}

}
