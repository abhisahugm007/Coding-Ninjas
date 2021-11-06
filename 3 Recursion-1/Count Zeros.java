
public class solution {

	public static int countZerosRec(int a){
		// Write your code here
        if(a==0)
            return 1;
        if(a<10){
            return 0;
        }
        int n=a%10;
        int t=a/10;
        if(n==0)
            return 1+countZerosRec(t);
        else
            return countZerosRec(t);
	}
}
