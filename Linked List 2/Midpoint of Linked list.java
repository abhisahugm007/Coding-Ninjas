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
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
    	int count=-1;
        LinkedListNode<Integer> l=head;
        while(l!=null)
        {
            count++;
            l=l.next;
        }
        int temp=0;
        count=count/2;
        l=head;
        while(temp!=count){
            temp++;
            l=l.next;
        }
        return l;
    }

}