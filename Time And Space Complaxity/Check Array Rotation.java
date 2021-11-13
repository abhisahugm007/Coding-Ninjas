public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int n=arr.length;
        if(n==0)
            return 0;
        int min=arr[0],minIndex=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

}