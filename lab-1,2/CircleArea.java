import java.util.Scanner;

public class CircleArea{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double redius;
		System.out.println("Enter the Redius :");
		redius = sc.nextDouble();
		System.out.println("Area of Circle is : " +Math.PI*redius*redius);
	}
}