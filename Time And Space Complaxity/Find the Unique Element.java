public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
        int x=0,n=arr.length;
        for(int i=0;i<n;i++)
            x=x^arr[i];
        return x;
	}
}