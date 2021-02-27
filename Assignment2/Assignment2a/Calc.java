public interface Calc {

	/**
	 * Add two  Number
	 * @param Num
	 * @return Number result of addition
	 */
	public abstract String add(String Num);

	/**
	 * Subtract  Number
	 * Num1 - Num2
	 * @param Num
	 * @return Number result of Subtraction
	 */
	public abstract String subtract(String Num);

	/**
	 * Multiply two  Number
	 * Num1 * Num2
	 * @param Num
	 * @return Number result of Multiplication
	 */
	public abstract String multiply(String Num);

	/**
	 * Divide  Number
	 * Num1 / Num2
	 * @param Num
	 * @return Number result of Division
	 */
	public abstract String divideBy(String Num);
	
	/**
	 * Compare two Numbers, and Return
	 * -1, if less than
	 * 0, if equal
	 * 1, if greater than
	 * @param Num
	 * @return Number
	 */
	public int compareTo(String Num);

}