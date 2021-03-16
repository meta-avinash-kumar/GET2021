package mystack;
/**
 * @author avinash.kumar_metacu
 *
 */
public class InFix {

	/**
	 * Evaluates infix expression
	 * @param inFixExp
	 * @return value of expression after evaluation
	 */
	public static int evaluate(String expression){
		ListStack<Integer> valueStack  = new ListStack<Integer>();
		ListStack<Character> opStack = new ListStack<Character>();
		for(int i=0; i<expression.length();i++) {
            char c = expression.charAt(i);
            //check if it is number
            if(Character.isDigit(c)){
                //Entry is Digit, it could be greater than one digit number
                int num = 0;
                while (Character.isDigit(c)) {
                    num = num*10 + (c-'0');
                    i++;
                    if(i < expression.length())
                        c = expression.charAt(i);
                    else
                        break;
                }
                i--;
                //push it into mystack
                valueStack.push(num);
            }else if(c=='('){
                //push it to operators mystack
                opStack.push(c);
            }
            //Closed brace, evaluate the entire brace
            else if(c==')') {
                while(opStack.peek()!='('){
                    int output = performOperation(valueStack, opStack);
                    //push it back to mystack
                    valueStack.push(output);
                }
                opStack.pop();
            }
            // current character is operator
            else if(isOperator(c)){
                //1. If current operator has higher precedence than operator on top of the mystack,
                //the current operator can be placed in mystack
                // 2. else keep popping operator from mystack and perform the operation in  numbers mystack till
                //either mystack is not empty or current operator has higher precedence than operator on top of the mystack
                while(!opStack.isEmpty() && precedence(c)<=precedence(opStack.peek())){
                    int output = performOperation(valueStack, opStack);
                    //push it back to mystack
                    valueStack.push(output);
                }
                //now push the current operator to mystack
                opStack.push(c);
            }
		 }
        //If here means entire expression has been processed,
        //Perform the remaining operations in mystack to the numbers mystack

        while(!opStack.isEmpty()){
            int output = performOperation(valueStack, opStack);
            //push it back to mystack
            valueStack.push(output);
        }
        return valueStack.pop();
            
	}
	
	/**
	 * Checks the precedence of operator
	 * @param c operator
	 * @return precedence value
	 */
	private static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

	/**
	 * performs operation on values and returns result 
	 * @param valueStack
	 * @param opStack
	 * @return result
	 */
    private static int performOperation(ListStack<Integer> valueStack, ListStack<Character> opStack) {
        int a = valueStack.pop();
        int b = valueStack.pop();
        char operation = opStack.pop();
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0;
    }

    /**
     * Checks whether character is operator or operand
     * @param c
     * @return
     */
    public static boolean isOperator(char c){
        return (c=='+'||c=='-'||c=='/'||c=='*'||c=='^');
    }
}
