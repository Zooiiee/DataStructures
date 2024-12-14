//Program: Parenthesis Balancing       

public class InToPost {
	// Operator Check
    	static boolean isOperator(char c) 
	{
        	return c == '+' || c == '-' || c == '*' || c == '/';
    	}

    	// Precedence
    	static int precedence(char operator)
	{
        	switch (operator) 
		{
            		case '+':
            		case '-':
                		return 1;
            		case '*':
            		case '/':
                		return 2;
            		default:
               			return -1;
        	}//end of switch
    	}//end of  Precedence

    // Convert Infix to Postfix
    	public static String infixToPostfix(String infix) 
	{
        	char[] stack = new char[infix.length()];
        	int tos = -1;
        	StringBuilder postfix = new StringBuilder();

        	// Step 1: Scan each Character
        	for (int i = 0; i < infix.length(); i++) 
		{
            		char ch = infix.charAt(i);

            		if (Character.isLetterOrDigit(ch)) 
			{
                		// Step 2: Operand - Append to postfix
                		postfix.append(ch);
            		} 
			else if (ch == '(') {
                		// Step 4: Open Parenthesis - Push
                		tos++;
                		stack[tos] = ch;
            		} 
			else if (ch == ')') {
             		   	// Step 5: Close Parenthesis - Pop
                		while (tos >= 0 && stack[tos] != '(') 
				{
                    			postfix.append(stack[tos]);
                    			tos--;
               			 }
                		tos--; // Pop the '(' from the stack
            		} 
			else if (isOperator(ch)) 
			{
                		// Step 3b
                		while (tos >= 0 && precedence(ch) <= precedence(stack[tos])) 
				{
                    			postfix.append(stack[tos]);
                    			tos--;
                		}
                		// Push current operator
               			tos++;
                		stack[tos] = ch;
            		}
       	 	}

        	// Pop remaining characters
        	while (tos >= 0) 
		{
            		postfix.append(stack[tos]);
            		tos--;
        	}
        	return postfix.toString();
    	}

    	// Main
    	public static void main(String[] args) 
	{
        	String infix = "((A+B)*(C/D))/E";
        	String result = infixToPostfix(infix);
       		System.out.println("Infix expression: " + infix);
        	System.out.println("Postfix expression: " + result);
    	}
}
