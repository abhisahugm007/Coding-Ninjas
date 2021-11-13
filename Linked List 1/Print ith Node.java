/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int count=-1;
        while(head!=null){
            count++;
            if(count==i)
            {
                System.out.println(head.data);
            	break;
            }
            head=head.next;
        }
	}
}