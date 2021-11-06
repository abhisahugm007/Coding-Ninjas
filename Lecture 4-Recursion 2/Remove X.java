import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}

public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
		if(input.isEmpty())
            return input;
        String ans="";
        if(input.charAt(0)!='x')
            ans=ans+input.charAt(0);
        String smallAns=removeX(input.substring(1));
        return ans+smallAns;
	}
}
