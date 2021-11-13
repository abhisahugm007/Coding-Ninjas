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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
        LinkedListNode<Integer> curr=head,t;
        if(M==0)
            return null;
        if(N==0 || head==null || head.next==null)
            return head;
        while(curr!=null)
        {
            for(int i=1;i<M && curr!=null;i++)
                curr=curr.next;
            if(curr==null)
                return head;
            t=curr.next;
            for(int i=1;i<=N && t!=null;i++)
                t=t.next;
            curr.next=t;
            curr=t;
        }
        return head;
        
	}
}