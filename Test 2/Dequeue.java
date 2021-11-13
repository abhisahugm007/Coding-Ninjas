/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/
import java.util.*;
public class Dequeue {
    // Complete this class
    int cap,size=0;
    public Dequeue(int data){
        cap=data;
    }
    List<Integer> l=new ArrayList<>(cap);
    
    
    void insertFront(int data){
        if(size==cap){
        	System.out.println("-1");
            return;
        }
        l.add(0,data);
        size++;
        return;
    }
    void insertRear(int data){
        if(size==cap){
        	System.out.println("-1");
            return;
        }
        l.add(data);
        size++;
        return;
    }
    void deleteFront(){
        if(size==0)
        {
            System.out.println("-1");
            return;
        }
        l.remove(0);
        size--;
        return;
    }
    void deleteRear(){
        if(size==0)
        {
            System.out.println("-1");
            return;
        }
        l.remove(size-1);
        size--;
        return;
    }
     int getFront(){
        if(size==0)
            return -1;
         return l.get(0);
     }
     int getRear(){
        if(size==0)
            return -1;
         return l.get(size-1);
     }
    
    
}