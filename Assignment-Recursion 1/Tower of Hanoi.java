import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		solution.towerOfHanoi(n, 'a', 'b', 'c');
	}
}

public class solution {

	public static void towerOfHanoi(int n, char a, char b, char c) {
		// Write your code here
        if(n>=1)
        {
        towerOfHanoi(n-1,a,c,b);
        System.out.println(a+" "+c);
        towerOfHanoi(n-1,b,a,c);
        }
	}
}
