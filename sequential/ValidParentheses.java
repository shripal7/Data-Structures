package sequential;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		System.out.println(new ValidParentheses().isValid("[{]"));
	}

	boolean isValid(String s) {
		Stack<Character> store = new Stack();
		Character x;
		for(int i=0;i<s.length();i++)
		{
			x = s.charAt(i);
			switch(x)
			{
		case '{':
			store.add(x);
			break;
		case '[':
			store.add(x);
			break;
		case '(':
			store.add(x);
			break;
		case '}':
			x = !store.empty()? store.pop(): ' ';
			if(x != '{')
				return false;
			break;
		case ']':
			x = !store.empty()? store.pop(): ' ';
			if(x != '[')
				return false;
			break;
		case ')':
			x = !store.empty()? store.pop(): ' ';
			if(x != '(')
				return false;
			break;
		default:
			return false; //can return error

			}
		}
return (store.empty());
	
	}
}