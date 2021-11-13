import java.util.*;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(solution.maximumProfit(input));
	}

}

class solution {

	public static int maximumProfit(int a[]) {
		// Write your code here
        Arrays.sort(a);
        int n=a.length;
		int x=a[0];
        int max=n*x;
        for(int i=0;i<n;i++)
        {
            x=a[i];
            int temp=(n-i)*x;
            if(temp>max)
                max=temp;
        }
        return max;
	}

}
