/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
    int real,img;
    int realSum,imgSum;
	public ComplexNumbers(int real,int img)
    {
        this.real=real;
        this.img=img;
    }
    public void plus(ComplexNumbers c)
    {
        realSum=real+c.real;
        imgSum=img+c.img;
    }public void multiply(ComplexNumbers c)
    {
        realSum=real*c.real-img*c.img;
        imgSum=real*c.img+img*c.real;
    }
    public void print()
    {
        System.out.println(realSum+" + i"+imgSum);
    }
}
