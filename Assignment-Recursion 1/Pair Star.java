import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.addStars(input));
	}
}

public class solution {

	// Return the updated string
	public static String addStars(String s) {
		if(s.length()==1)
            return s;
        String sol=addStars(s.substring(1));
        if(s.charAt(0)==s.charAt(1))
            return s.charAt(0)+"*"+sol;
        else
            return s.charAt(0)+sol;
	}
 }
