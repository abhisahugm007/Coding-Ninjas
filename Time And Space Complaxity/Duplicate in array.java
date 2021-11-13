import java.util.*;
public class Solution {

	public static int findDuplicate(int[] a) {
       int sum=0,n=a.length;
        for(int i=0;i<n;i++)
            sum=sum+a[i];
        n=n-1;
        int nsum=(n*(n-1))/2;
        return sum-nsum;
	}
}