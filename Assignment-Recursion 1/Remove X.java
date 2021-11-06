import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}

public class solution {

    public static String help(String str,int s,int e,String t)
    {
        if(s>=e)
            return t;
        if(str.charAt(s)!='x'){
            t=t+str.charAt(s);
        }
        return help(str,s+1,e,t);
        
    }
	// Return the changed string
	public static String removeX(String str){
		// Write your code here
		String t="";
        return help(str,0,str.length(),t);
	}
}
