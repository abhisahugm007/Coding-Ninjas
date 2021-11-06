import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		// Write your code here

        if(str.length()==1)
            return str;
        String smallsol=removeConsecutiveDuplicates(str.substring(1));
        String sol="";
        if(str.charAt(0)!=smallsol.charAt(0))
            sol=sol+str.charAt(0);
        return sol+smallsol;
        
	}

}