/**
 * 
 */
package power;

/**
 * @author Saif_sust_2013331007
 *
 */
public class power {

	/**
	 * @param args
	 */
	public static String pow(String num, int exp) {
		String answer = "1";
		if (exp == 0) {
			return "1";
		} else {
			if (exp == 1) {
				return num;
			} else {
				for (int i = 1; i <= exp; i++) {
					answer = multiply.multiplier.multply(num, answer);
				}
				return answer;
			}
		}

	}

	public static void main(String[] args) {
     System.out.println(power.pow("2", 99));
	}

}
