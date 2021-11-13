import java.util.Scanner;


public class runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(solution.splitArray(input));
	}
}


class solution {
    
    public static boolean help(int a[],int n,int s,int fsum,int tsum){
        if(n==s)
            return fsum==tsum;
        if(a[s]%5==0)
            fsum+=a[s];
        else if(a[s]%3==0)
            tsum+=a[s];
        else
            return help(a,n,s+1,fsum+a[s],tsum) || help(a,n,s+1,fsum,tsum+a[s]);
        return help(a,n,s+1,fsum,tsum);
    }

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return help(input,input.length,0,0,0);
	}
	

}

