
import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String s) {
		//Your code goes here
        Stack<Character> st=new Stack<>();
        boolean sol=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==')'){
                int count=0;
                char temp=st.peek();
                while(temp!='(' ){
                    count++;
					st.pop();
                    temp=st.peek();
                }
                st.pop();
                if(count<=1)
                    return true;
            }
            else{
                st.push(c);
            }
            
        }
        return sol;
	}
}