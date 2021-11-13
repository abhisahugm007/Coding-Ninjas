// /*

//     Following is the Node class already written for the Linked List

//     class LinkedListNode<T> {
//         T data;
//         LinkedListNode<T> next;
    
//         public LinkedListNode(T data) {
//             this.data = data;
//         }
//     }

// */


// public class Solution {
    
//     public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> a, LinkedListNode<Integer> b) {
//         if(a==null)
//             return b;
//         if(b==null)
//             return a;
 // LinkedListNode<Integer> start=null,t=null;
//         if(a.data<=b.data){
//             start=a;
//             t=a;
//             t=t.next;
//         }
//         else{
//             start=b;
//             tail=b;
//             t
//         }
        
        
//         while(a!=null && b!=null)
//         {
//             if(a.data<b.data)
//             {
//                 if(start==null){
//                     start=a;
//                 	t=a;
//                 }
//                 else
//                     t.next=a;
//                 a=a.next;
//             }
//             else
//             {
//                 if(start==null){
//                     start=b;
//                 	t=b;
//                 }
//                 else
//                     t.next=b;
//                 b=b.next;
//             }
//         }
//         if(a!=null)
//             t.next=a;
//         else
//             t.next=b;
//         return start;
            
        
//     }

// }

public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
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
    }
