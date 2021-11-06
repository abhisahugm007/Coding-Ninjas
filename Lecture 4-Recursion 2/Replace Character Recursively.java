import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(Solution.replaceCharacter(input, c1, c2));
	}
}

public class Solution {

	public static String replaceCharacter(String s, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(s.length()==0)
            return s;
        String smallsol=replaceCharacter(s.substring(1),c1,c2);
        String sol="";
        if(s.charAt(0)==c1)
            sol=sol+c2;
        else
            sol=sol+s.charAt(0);
		return sol+smallsol;
    }
}
