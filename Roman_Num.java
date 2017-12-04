import java.util.*;

public class Roman {
    public static void main(String[] args){
        String romanNum = args[0];
        int len = romanNum.length();
        
        Dictionary dict = new Hashtable();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        
        int sum = 0;
        char curr;
        char next;
        if(len == 1) {sum+=((int)dict.get(romanNum.charAt(0)));}
        else{
            //System.out.println("Here");
            for(int i = 0; i < (len-1); i++)
            {
                //System.out.print("inside");
                curr = romanNum.charAt(i);
                next = romanNum.charAt(i+1);
                if(((curr == 'I') || (curr == 'X') || (curr == 'C')) && (next != null))
                {
                    
                    
                    
                    if((int)dict.get(curr) < (int)dict.get(next)){
                        sum += ((int)dict.get(next)-(int)dict.get(curr));
                        i++;
                    }
                    else
                    {
                        sum += ((int)dict.get(curr) + (int)dict.get(next));
                        i++;
                    }
                    
                }else {
                    sum += (int)dict.get(curr);
                    
                }
                
            }
        }
        System.out.print(sum);
        
        
    }
}