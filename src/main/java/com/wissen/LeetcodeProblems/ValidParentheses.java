package com.wissen.LeetcodeProblems;

import java.util.Stack;

public class ValidParentheses {
	
	 public boolean isValid(String s) {

	        Stack<Character> stack = new Stack<>();
	        for(char character : s.toCharArray())
	        {
	            if(character == '(' || character == '[' || character == '{')
	                stack.push(character);
	            else
	            {
	                if(stack.isEmpty())
	                    return false;
	                else
	                {
	                    char top = stack.peek();
	                    if((character == ')' && top == '(') || (character == ']' && top == '[') || 
	                    (character == '}' && top == '{'))
	                        stack.pop();
	                    else
	                        return false;

	                }
	            }
	        }
	        return stack.isEmpty();
	    }

}
