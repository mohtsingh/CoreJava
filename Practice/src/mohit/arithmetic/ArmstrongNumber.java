package mohit.arithmetic;

public class ArmstrongNumber {

	/**
	 * A three Armstrong number is a number that is equal to the sum of cubes of
	 * its digits for example 153, 370, 371, 407. A four digit no similarly is
	 * one which is equal to sum of digits to the power 4 like 9474.
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isArmstrongNumber(int num) {
		int sum = 0;
		int temp = num;
		int noOfDigits = numberOfDigits(num);
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			// System.out.println("Digit : " + digit + "Remaining Number: " +
			// num);
			sum = sum + (int) Math.pow(digit, noOfDigits);
		}
		if (temp == sum) {
			System.out.println("Number : " + temp + " is a Armstrong Number");
			return true;
		}
		System.out.println("Number : " + temp + " is not a Armstrong Number");
		return false;
	}

	/**
	 * To get number of digits in a number.
	 * 
	 * @param num
	 * @return
	 */
	public static int numberOfDigits(int num) {
		int digits = 0;
		while (num > 0) {
			num = num / 10;
			digits++;
		}
		return digits;
	}

	public static void main(String args[]) {
		System.out.println(numberOfDigits(546634634));
		isArmstrongNumber(153);
		isArmstrongNumber(9474);
	}
}
