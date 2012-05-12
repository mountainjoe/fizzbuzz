public class FizzBuzz {
	public static void main(String[] args) { 
		new FizzBuzz(3,5).run(1,100);
	}
	
	private int fizzdiv;
	private int buzzdiv;

	public FizzBuzz(int fd, int bd) {
		fizzdiv = fd; 
		buzzdiv = bd;
	}

	private void run(int start, int end) {
		for (int i=start; i <= end; ++i) {
			if (i % fizzdiv == 0 && i % buzzdiv == 0)
				System.out.println("FizzBuzz");
			else if (i % fizzdiv == 0)
				System.out.println("Fizz");
			else if (i % buzzdiv == 0)
				System.out.println("Buzz");
			else 
				System.out.println(i);
		}
	}
}
