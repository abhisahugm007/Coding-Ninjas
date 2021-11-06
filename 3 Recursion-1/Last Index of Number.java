public class Solution {
    
    public static void helper(int [] arr, int x, int start, int [] answer) {
        
        if(start == arr.length) {
            
            return;
        }
        
        if(arr[start] == x) {
            
            answer[0] = start;
        }
        
        helper(arr,x,start+1,answer);     
    }

	public static int lastIndex(int a[], int x) {
        
        int [] answer = {-1};
        
        helper(a,x,0,answer);
        
        return answer[0];
	}
}