import java.util.Scanner;

public class SumAvg{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enetr the value :");
		n = sc.nextInt();
		int sum = 0;

		for(int i=1;i<=n;i++){
			sum +=i;
		}
		double avg = (double)sum/n;
		System.out.println("Average is : "+avg);
	}
}