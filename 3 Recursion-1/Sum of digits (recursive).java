
public class solution {

	public static int sumOfDigits(int n)
    {// Write your code here
	if(n==0)
        return 0;
    int t=n%10;
    int x=n/10;
    return t+sumOfDigits(x);
	}
}
