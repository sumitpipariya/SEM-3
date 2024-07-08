import java.util.Scanner;

public class Swap{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the value of a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		swapno(a,b);
	}

	static void swapno(int a, int b){

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("A is : " +a);
		System.out.println("B is : " +b);
	}
}