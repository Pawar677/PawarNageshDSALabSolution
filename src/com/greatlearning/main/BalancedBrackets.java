package com.greatlearning.main;
import java.util.Stack;

public class BalancedBrackets {
	private static boolean isBalanced (String bracketExpression) {
		Stack stack = new Stack();
	// Iterate through character	
		for (char c: bracketExpression.toCharArray() ) {
			
			//System.out.println(c);
	// Check c is '(','[','{'
			if (c == '(' || c == '[' || c=='{') {
	// push to stack
				stack.push(c);
			}
			else {
	// If Stack is empty 
				if (stack.isEmpty()) {
					return false;
				}
	// pop from stack (d)
				Character d= (Character) stack.pop();
	// Check if 'c' is closing bracket for 'd'
				if(c=='}' && d != '{' || (c==']' && d != '[') || (c==')' && d != '(')  ) {
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}
	public static void main (String [] args) {
		String bracketExpression = "([[{}]])";
		if ( isBalanced ( bracketExpression )) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}

}
