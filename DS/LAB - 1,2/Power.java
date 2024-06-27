import java.util.Scanner;

public class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int no,power;
		System.out.println("Enter the number :");
		no = sc.nextInt();
		System.out.println("Enter the Power :");
		power = sc.nextInt();
		int a = 1;
			for(int i=1;i<=power;i++){
				a*=no;
			}

		System.out.println("Ans is : "+a);
		}
	}
