//Write a program for evaluation of prefix Expression using Stack.

import java.util.Scanner;
import java.util.Stack;

public class EvalutionPrefix{

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the infix String : ");
		String temp = sc.next();
		int value = temp.length();
		temp =" " + temp;

		while(temp.charAt(value)!= ' '){

			if(Character.isDigit(temp.charAt(value))){

				stk.push(Integer.parseInt(""+temp.charAt(value)));
				
			}

			else{

				int operand1 = stk.pop();
				int operand2 = stk.pop();
				int result=0;

				if(temp.charAt(value) == '+'){
					result = operand2 + operand1;
				}
				else if(temp.charAt(value) == '-'){
					result = operand1 - operand2;
				}
				else if(temp.charAt(value) == '*'){
					result = operand1 * operand2;
				}
				else if(temp.charAt(value) == '/'){
					result = operand1 / operand2;
				}
				else if(temp.charAt(value) == '^'){
					result = (int)Math.pow( operand1,operand2);
				}
				else{
					System.out.println("Invalid String");
				}
				stk.push(result);

			}
			
			value--;
		}
 
		System.out.println(stk.pop());

	}
}