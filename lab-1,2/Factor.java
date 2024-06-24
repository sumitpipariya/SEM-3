import java.util.Scanner;

public class Factor{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number;
		System.out.println("Enter the Number");
		number = sc.nextInt();
		for(int i=1;i<=number;i++){
			if(number%i==0){
				System.out.println("Factor is : "+i);
			}
		}
		
	}

}