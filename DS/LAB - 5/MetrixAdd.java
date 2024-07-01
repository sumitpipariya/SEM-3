import java.util.Scanner;

public class MetrixAdd{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enetr the  row : ");
		int r = sc.nextInt();
		System.out.print("Enter the column : ");
		int c = sc.nextInt();
		System.out.println("Enter the metrix ");

		int metrix1[][] = new int[r][c];

		for(int i=0;i<metrix1.length;i++){
			for(int j=0;j<metrix1.length;j++){

				metrix1[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enetr the Second metrix : ");
		System.out.println("");

		int metrix2[][] = new int[r][c];

		for(int i=0;i<metrix2.length;i++){
			for(int j=0;j<metrix2.length;j++){

				metrix2[i][j] = sc.nextInt();
			}
		}

		int sum[][] = new int[r][c];

		for(int i=0;i<sum.length;i++){
			for(int j=0;j<sum.length;j++){

				sum[i][j] = metrix1[i][j] + metrix2[i][j] ;
			}
		}

		System.out.println("Sum is : ");

		for(int i=0;i<sum.length;i++){
			for(int j=0;j<sum.length;j++){

				System.out.print(sum[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}