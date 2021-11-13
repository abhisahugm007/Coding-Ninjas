import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
		//Your code goes here
        if(q.size()<k || k==0 || q.size()==0)
            return q;
        Stack<Integer> st=new Stack<>();
        int count=0;
        while(count!=k){
            st.push(q.remove());
            count++;
        }
        Queue<Integer> newq=new LinkedList<>();
        while(!st.isEmpty())
			newq.add(st.pop());        
        while(!q.isEmpty())
            newq.add(q.remove());
        return newq;
	}

}