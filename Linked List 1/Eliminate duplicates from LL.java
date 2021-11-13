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

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null)
            return head;
        int x=head.data;
         LinkedListNode<Integer> temp=head;
        while(temp.next!=null){
            if(temp.next.data==x){
                temp.next=temp.next.next;
            }else{
                x=temp.next.data;
                temp=temp.next;
            }
            
        }
        return head;
	}

}