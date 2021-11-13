/*From recursion
public class Solution {
	public static boolean checkSequence(String a, String b) {
		if(b.length() == 0) {
			return true;
		}
		if(a.length() == 0) {
		return false;
		}
		if(a.charAt(0) == b.charAt(0)) {
			return checkSequence(a.substring(1), b.substring(1));
		} else {
			return checkSequence(a.substring(1), b);
		}
	}
}





import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(Solution.checkSequence(large, small));
	}
}



class Solution {
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int n=a.length();
        int m=b.length();
        int t=0;
		for(int i=0;i<m;i++)
        {
            int flag=0;
            char c=b.charAt(i);
            for(int j=t;j<n;j++)
            {
                if(a.charAt(j)==c){
                 	flag=1;
                    t=j+1;
                    break;
                }
            }
            if(flag==0)
                return false;
        }
        return true;
	}
}