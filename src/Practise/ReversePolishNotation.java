package Practise;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] exp = {"2","3","-","3","-"};
		int i = evalExp(exp);
		System.out.println("Result: "+ i);

	}
	
	public static int evalExp(String[] exp) {
		
		String operators = "+-*/"; 
		Stack<String> stack = new Stack<String>();
		
		for (String token: exp) {
			if(!operators.contains(token)) {
				System.out.println("Pushing "+ token + " into stack");
				stack.push(token);				
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				System.out.println("Poping "+ a + " from stack");
				System.out.println("Poping "+ b + " from stack");
				switch(token) {
				case "+":
					System.out.println("Pushing "+ (a+b) + " into stack");
					stack.push(String.valueOf(a+b));
					break;
				case "-":
					System.out.println("Pushing "+ (a-b) + " into stack");
					stack.push(String.valueOf(b-a));
					break;
				case "*":
					System.out.println("Pushing "+ (a*b) + " into stack");
					stack.push(String.valueOf(a*b));
					break;
				case "/":
					System.out.println("Pushing "+ (a/b) + " into stack");
					stack.push(String.valueOf(b/a));
					break;
				}
			}			
		}
		
		return (Integer.valueOf(stack.pop()));
		
	}

}
