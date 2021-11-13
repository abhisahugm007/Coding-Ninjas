import java.util.*;
public class Solution {	
	public static int pairSum(int[] arr, int sum) {
        int n=arr.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
 
        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {
 
            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
 
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);
            
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
	}
}