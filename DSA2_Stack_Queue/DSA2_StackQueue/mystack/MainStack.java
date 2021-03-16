package mystack;
/**
 * @author avinash.kumar_metacu
 *
 */
public class MainStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String infixExpression = "2 * (5 *(3+6))/15-2";
        System.out.println(InFix.evaluate(infixExpression));
	}

}
