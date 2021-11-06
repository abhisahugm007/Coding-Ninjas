import java.util.Scanner;

public class runner {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}


public class solution {
	
    public static void Merge(int[] arr,int si,int ei,int mid)
    {
    	int[] l=new int[mid-si+1];
        int[] r=new int[ei-mid];
        int[] a=new int[ei-si+1];
        int j=0;
        for(int i=si;i<=mid;i++)
            l[j++]=arr[i];
        j=0;
        for(int i=mid+1;i<=ei;i++)
            r[j++]=arr[i];
        int i=0,k=0;
        j=0;
        while(i<l.length && j<r.length)
        {
            if(l[i]<r[j])
                a[k++]=l[i++];
            else
                a[k++]=r[j++];
        }
        while(i<l.length){
            a[k++]=l[i++];
        }
        while(j<r.length)
            a[k++]=r[j++];
        k=0;
        for(int t=si;t<=ei;t++)
        {
            arr[t]=a[k++];
        }
        
    }
    
    
    public static void MergeSort(int[] arr,int si,int ei){
        if(si>=ei)
            return;
        int mid=(si+ei)/2;
        MergeSort(arr,si,mid);
        MergeSort(arr,mid+1,ei);
        Merge(arr,si,ei,mid);
    }
    	
    
	public static void mergeSort(int[] input){
		// Write your code here
        
		MergeSort(input,0,input.length-1);
	}
}
