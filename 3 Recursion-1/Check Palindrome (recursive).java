
public class solution {
    public static boolean pal(String s,int start,int end)
    {
        if(start>=end)
            return true;
        
        if(s.charAt(start)!=s.charAt(end-1))
            return false;
    	return pal(s,start+1,end-1);
    }

	public static boolean isStringPalindrome(String s) {
		// Write your code here
        if(s.length()==0)
        {
            return false;
        }
		boolean help=pal(s,0,s.length());
        return help;
	}
}
