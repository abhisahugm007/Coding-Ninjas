/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        if(head==null)
            return head;
        int count=-1;
        LinkedListNode<Integer> node=head;
        if(pos<0)
            pos=pos*(-1);
        else if(pos==0){
            head=head.next;
        	return head;
        }
        while(node!=null){
            count++;
            if(pos-1==count && node.next!=null){
               // LinkedListNode<Integer> temp=node.next;
                node.next=node.next.next;
                //temp.next=null;
                return head;
            }
            node=node.next;
        }
        return head;
	}
}
