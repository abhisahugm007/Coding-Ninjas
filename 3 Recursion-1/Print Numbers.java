public class Solution {

	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
		}
        else{
        print(n - 1);
		System.out.print(n+" ");
        }
	}

}