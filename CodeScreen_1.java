/*
* When compiling this program, there will be a note. This program will run anyways.
* To use this program please wait for the prompt to ask you for your string.
* You can enter an entire sentence like: This program is amazing!
*/
import java.util.*;

public class CodeScreen_1
{
	
	public static void main(String[] args)
	{
		//Take argument from command line
		System.out.print("Please enter a string you want to reverse:" + "\n");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();

		//Turn string into char array
		char[] chh = string.toCharArray();

		//Using a stack to reverse string
		Stack st = new Stack();
		int len = string.length();
		for(int index = 0; index < len; index++){
			st.push(chh[index]);
		}
		
		//Put new string string into a char array
		char[] ch = new char[len];
		for(int i = 0; i < len; i++)
		{
			ch[i] = (Character) st.pop();
		}

		//New reversed string
		String revStr = new String(ch);
		System.out.println(revStr);
	}	
}