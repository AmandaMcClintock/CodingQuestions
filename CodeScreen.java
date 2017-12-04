/*
For these problems, you are welcome to use whichever programming language you are most comfortable with (please specify which language you used though when returning your answers). Also for question number 1, please code without using framework string reversal. Let me know if you have any questions. Thanks!
 
1. Given a string, write a function or method that takes in that string, and returns the same string in reverse order.
• Example: Given the string “Hello”, your program would return “olleH”
 
2. Given a string, return the character count for each distinct character in the string.
• Example: "abacca" -> a: 3, b: 1, c: 2
*/
import java.util.*;

public class CodeScreen
{
	
	public static void main(String[] args)
	{

		//Take argument from command line
		System.out.print("Please enter a string you want to reverse:" + "\n");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();

		//Turn string into char array
		char[] chh = string.toCharArray();
		int len = string.length();
		Stack st = new Stack();

		//Using a stack to reverse string
		for(int index = 0; index < len; index++){
			st.push(chh[index]);
		}
		
		//Put new string string into a char array
		char[] ch = new char[len];
		for(int i = 0; i < len; i++)
		{
			ch[i] = (Character) st.pop();
		}

		String revStr = new String(ch);
		System.out.println(revStr);
	}	
}