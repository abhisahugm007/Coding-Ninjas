	//BY CN
public class Solution {
static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
LinkedListNode<Integer> current = head;
LinkedListNode<Integer> prev = null;
while(current != null){
LinkedListNode<Integer> temp = current.next;
current.next = prev;
prev = current;
current = temp;
}
return prev;
}
/* First reverse the number, add 1 to it and traverse it for carry to travel till the most
significant digit and then if carry exists, append to linked list and reverse again to get
final result
*/
public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
head = reverse(head);
int carry =1,num;
LinkedListNode<Integer> ptr=head, prev=null;
while(ptr != null){
num = ((ptr.data)+carry)%10;
carry = ((ptr.data)+carry)/10;
ptr.data = num;
prev=ptr;
ptr = ptr.next;
}
if(carry == 1){
LinkedListNode<Integer> tail = new LinkedListNode<Integer>(carry);
prev.next = tail;
}
return reverse(head);
}
}
     





/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/
		//BY ME
public class Solution {


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
   		if(head==null)
        {
            return new LinkedListNode<Integer>(1);
        }
        LinkedListNode<Integer> node=head;
        while(node.next!=null)
            node=node.next;
        if(node.data!=9)
        {
            node.data+=1;
            return head;
        }
        else{
            
        }
        return head;
	}


}
