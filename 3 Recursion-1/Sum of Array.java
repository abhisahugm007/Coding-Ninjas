public class Solution {

	public static int sum(int arr[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int n=arr.length-1;
        if(n<0){
            return 0;
        }
		int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
			a[i]=arr[i];
        }
        return arr[n]+sum(a);
        
	}
}