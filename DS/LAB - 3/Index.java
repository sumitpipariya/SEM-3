import java.util.Scanner;

public class Index{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}

		int max = a[0];
		int min = a[0];

		for(int i=0;i<5;i++){
			max = (a[i]>=max)? i:max;
		}
		System.out.println("Max Index is : "+max);

		for(int i=0;i<5;i++){
			min = (a[i]<=min)? i:min;
		}
		System.out.println("Min Index is : "+min);
		
	}
}