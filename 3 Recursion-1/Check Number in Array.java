public class Solution {
	
	public static boolean checkNumber(int a[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int n=a.length;
        if(n<1){
            return false;
        }
        if(a[n-1]==x)
        {
            return true;
        }else{
            int[] arr=new int[n-1];
            for(int i=0;i<n-1;i++)
            {
                arr[i]=a[i];
            }
           return checkNumber(arr,x); 
        }
       
	}
}