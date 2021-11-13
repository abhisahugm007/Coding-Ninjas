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

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        int count=0;
        LinkedListNode<Integer> li=head;
        LinkedListNode<Integer> temp=head;
        while(li!=null){
            count++;
            li=li.next;
        }
        int pos=count-n;
        if(pos==0 || head==null || n==0)
            return head;
        count=0;
        li=head;
        while(li.next!=null){
            count++;
            if(count==pos){
            	temp=li.next;
                li.next=null;
                li=temp;
            }else
                li=li.next;
        }
        li.next=head;
        head=temp;
        return head;
	}
}