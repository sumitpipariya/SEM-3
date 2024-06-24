import java.util.Scanner;

public class SumArray{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int m,n;
		System.out.println("Enter first value :");
		m = sc.nextInt();
		System.out.println("Enetr the second value :");
		n = sc.nextInt();
		int sum = 0;

		for(int i=m;i<=n;i++){
			sum +=i;
		}
		System.out.println("Sum is :" +sum);
	}
}