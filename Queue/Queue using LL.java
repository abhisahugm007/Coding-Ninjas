/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {
	
	//Define the data members
		private Node front;
        private Node rear;
    	int size=0;
	
	public Queue() {
		//Implement the Constructor
        front=null;
        rear=null;
        size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//4   Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//5    Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//1    Implement the enqueue(element) function
        Node node=new Node(data);
        if(rear==null)
        {
            front=node;
            rear=node;
        }else{
            rear.next=node;
            rear=node;
        }
        size++;
    }


    public int dequeue() {
    	//2   Implement the dequeue() function
        if(size==0)
            return -1;
        if(front==rear)
            rear=null;
        int fdata=front.data;
        front=front.next;
        size--;
		return fdata;
      
    }


    public int front() {
    	//3   Implement the front() function
        if(size==0)
            return -1;
        return front.data;
    }
}
