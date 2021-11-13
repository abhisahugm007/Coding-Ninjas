public class solution {

	public static void printKeypad(int n){
		// Write your code here
        String[] ans=keypad(n);
    	for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
		
	}
	// Return a string array that contains all the possible strings
    static String[] keys(int n)
    {
        
        switch(n){
                case 2: return new String[] {"a","b","c"};
                // break;
                case 3: return new String[] {"d","e","f"};
                // break;
                case 4: return new String[] {"g","h","i"};
                // break;
                case 5: return new String[] {"j","k","l"};
                // break;
                case 6: return new String[] {"m","n","o"};
                // break;
                case 7: return new String[] {"p","q","r","s"};
                // break;
                case 8: return new String[] {"t","u","v"};
                // break;
                case 9: return new String[] {"w","x","y","z"};
                // break;
            	default: return new String[] {""};
                // break;
                
        }
    }
	public static String[] keypad(int n){
		// Write your code here
        if(n<=1)
            return  new String[] {""};
        String[] x=keypad(n/10);
        int t=n%10;
        String[] key=keys(t);
        String[] ans=new String[(x.length)*key.length];
        int k=0;
        for(int i=0;i<key.length;i++)
        {
            for(int j=0;j<x.length;j++)
            {
                ans[k++]=x[j]+key[i];
            }
        }
        return ans;

	}
	
}
