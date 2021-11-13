/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {
    static LinkedListNode<Integer> left;

    public static boolean isPalindrome(LinkedListNode<Integer> right,LinkedListNode<Integer> head){
         left=head;
        
        if(right==null)
            return true;
        boolean iP=isPalindrome(right.next,head);
        if(iP==false)
            return false;
        
        boolean iP2=(right.data==left.data);
        left=left.next;
        return iP2;
        
    }
    
    
    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        return isPalindrome(head,head);
        
	}

}