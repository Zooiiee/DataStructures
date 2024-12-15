//Program: Postfix Evaluation

import java.util.*;

class PostEval
{
	public static void main(String[] args)
	{
		String expr = "98*5+62/-";
		
		int result = Evaluate(expr);
		System.out.println("Expression : " + expr);
		System.out.println("Result of PostFix Evaluation : " + result);
		
	}//end of main

	public static int Evaluate(String ex)
	{
		//Create a Stack
		int[] stack = new int[ex.length()];
		int tos = -1;
		
		//loop through postfix ex
		for(int i=0; i<ex.length(); i++)
		{
			char ch = ex.charAt(i);

			if(Character.isDigit(ch))
			{
				tos++;		
				stack[tos] = ch-'0'; //character to int
			}
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') //if ch is operator
			{
				int op2 = stack[tos--]; //pop the 2nd operand
				int op1 = stack[tos--]; //pop the 1st operand

				int res = 0;
				switch(ch)
				{
					case '+' :
						res = op1 + op2;
						break;

					case '-' :
						res = op1 - op2;
						break;

					case '*' :
						res = op1 * op2;
						break;

					case '/' :
						res = op1 / op2;
						break;



				}//end of switch

				//Push the result on the stack
				tos++;
				stack[tos] = res ;
			}
		} //end of for

		//Final result
		return stack[tos];

	}//end of Evaluate 
}//end of PostEval
