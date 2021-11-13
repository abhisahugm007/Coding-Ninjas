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

		static void deleteNode(LinkedListNode<Integer> head, int pos) {
        if(head==null)
        	return;
      	if(pos==1)
        {
          if(head.next!=null)
          	head.next=head.next.next;
      	 return;
      	}else
        	deleteNodeRec(head.next,pos-1);
       }
    
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
         if(head==null)
            return null;
        if(pos==0)
            return head.next
        deleteNode(head,pos);
        
        return head;
       
        }

}