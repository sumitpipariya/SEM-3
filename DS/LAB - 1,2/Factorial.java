import java.util.Scanner;

public class Factorial{

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt();
		int a = 1;
		for(int i=1;i<=n;i++){
			a = a*i;
		}
		System.out.println("Factorial is : "+ a);
	}
}