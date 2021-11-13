
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        if(n!=0){
        int[] a=new int[n];
        d=d%n;
        for(int i=0;i<n;i++)
        {
            int t=i-d;
            if(t<0)
                t=n+t;
            a[t]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=a[i];
        }
      }
    }

}