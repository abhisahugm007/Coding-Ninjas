import java.util.*;
public class Solution {

	public static int[] stockSpan(int[] a) {
		//Your code goes here
        if(a.length==0)
            return a;
        Stack<Integer> st=new Stack();
        int[] arr=new int[a.length];
       arr[0]=1;
        st.push(0);
        for(int i=1;i<a.length;i++){
            
            while(st.size()!=0  && a[st.peek()]<a[i])
                st.pop();
            
            if(st.isEmpty())
                arr[i]=i+1;
            else
                arr[i]=i-st.peek();
            st.push(i);
            
        }
        
        return arr;
        
	}

}