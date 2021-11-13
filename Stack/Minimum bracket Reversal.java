import java.util.*;
public class Solution {

	public static int countBracketReversals(String a) {
		//Your code goes here
		int n=a.length();
        if(n%2!=0)
            return -1;
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++){
            
            char c=a.charAt(i);
			if(st.isEmpty())
                st.push(c);
            else if(c=='}')
            {
                if(st.peek()=='{')
                    st.pop();
                else{
             		st.push(c);       
                }
            }else
                st.push(c);
        }
		while(!st.isEmpty())
        {
            char c1=st.pop();
            char c2=st.pop();
            if(c1==c2)
                count++;
            else{
                count+=2;
            }
        }
        return count;
    }

}