import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> q) {
		//Your code goes here
   		 if (q.isEmpty())
        return;
 
    // Dequeue current item (from front) 
    int data = q.peek();
    q.remove();
 
    // Reverse remaining queue 
    reverseQueue(q);
 
    // Enqueue current item (to rear) 
    q.add(data);
         
	}

}