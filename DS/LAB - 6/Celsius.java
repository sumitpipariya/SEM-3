import java.util.Scanner;

public class Celsius{

	public static void main(String[] args) {
		
		int c;
		double f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celsius: ");
		c = sc.nextInt();

		f = ((9/5)*c) + 32;
		System.out.println("Ferinhit is : " +f);

	}

}