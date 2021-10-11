package driver;

import java.util.*;
public class Question1 {
	static Boolean checkBalanced(String str){
		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < str.length(); i++)
		{
			char x = str.charAt(i);
			if (x == '(' || x == '[' || x == '{'){
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;

			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brackets String :");
		String br = sc.next();
		if (checkBalanced(br))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}



}
