

public class Solution {
    
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
            
        }
        LinkedListNode<Integer>t1=head1,t2=head2;
        LinkedListNode<Integer>head=null,tail=null;
        if(t1.data <=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
                
            }
            else
            {
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
            }
        //One list is over
        if(t1!=null){
            //first list is remaining 
            tail.next=t1;
        }
        else{
            tail.next=t2;
        }
        return head;
        }
    
    
    
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
    
    
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        else{
            LinkedListNode<Integer> mid=midPoint(head);
             LinkedListNode<Integer> midNext=mid.next;
            mid.next=null;
            LinkedListNode<Integer> a=mergeSort(head);
            LinkedListNode<Integer> b=mergeSort(midNext);
            return merge(a,b);
        }
    }

}