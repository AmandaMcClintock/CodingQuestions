import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        
        int length = expression.length();
        //if((length % 2) != 0) return false;
        //char newExp[] = expression.toCharArray();
        Stack st = new Stack();
        char temp;
        for(int i = 0; i < (length/2); i++){
            st.push(expression.charAt(i));
            
            System.out.println(st.peek());
        }
        for(int j = (length/2); j < length; j++){
            temp = (char)st.pop();
            //System.out.println(temp + " " + expression.charAt(j));
            //System.out.println(temp);
            
            if(temp == '{' && (expression.charAt(j) =='}')) {System.out.println('}');}
            else if(temp == '(' && (expression.charAt(j) ==')')) {System.out.println(')');}
            else if(temp == '[' && (expression.charAt(j) ==']')){System.out.println(']');}
            else return false;
            
        }
        return true;
        /*
        // Must be even
        if ((expression.length() & 1) == 1) return false;
        else {
          char[] brackets = expression.toCharArray();
          Stack<Character> s = new Stack<>();
          for (char bracket : brackets)
            switch (bracket) {
              case '{': s.push('}'); break;
              case '(': s.push(')'); break;
              case '[': s.push(']'); break;
              default :
                if (s.empty() || bracket != s.peek())
                  return false;
                s.pop();
            }
          return s.empty();
        }

    }*/
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int t = 1;//in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = "{{[[(())]]}}";
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}