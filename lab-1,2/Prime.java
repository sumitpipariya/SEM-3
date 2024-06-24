import java.util.Scanner;

public class Prime{
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt();
		boolean a = false;
		for(int i=2;i<n;i++){
			if(n%i==0){
				a = true;
				break;
			}
		}
		if(a==false){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Not Prime number");
		}

	}
}