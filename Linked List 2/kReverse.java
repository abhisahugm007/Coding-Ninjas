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
    
    public static LinkedListNode<Integer> rev(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> li=rev(head.next);
        head.next.next=head;
        
        head.next=null;
        return li;
        
	}
    
    

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        if(head==null || k==0)
            return head;
        
        int count=0;
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> next=null;
        
        while(count<k && curr!=null)
        {
            count++;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;   
        }
        
        if(next!=null)
            head.next=kReverse(next,k);
        return prev;
        
        
	}

}