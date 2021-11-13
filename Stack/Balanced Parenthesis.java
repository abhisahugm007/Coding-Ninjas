
import java.util.Stack;
public class Solution {

    public static boolean isBalanced(String e) {
        //Your code goes here
        Stack<Character> s=new Stack<>();
        for(int i=0;i<e.length();i++)
        {
            char c=e.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                s.push(c);
            else{
                if(s.size()==0)
                    return false;
                s.pop();
            }
        }
        return s.size()==0;
        
    }
}