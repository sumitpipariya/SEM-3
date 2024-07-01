import java.util.Scanner;

public class MetrixMultiplication{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the metrix ");
		System.out.print("Enetr the  row : ");
		int r1 = sc.nextInt();
		System.out.print("Enter the column : ");
		int c1 = sc.nextInt();

		int metrix1[][] = new int[r1][c1];

		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){

				metrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enetr the Second metrix");

		System.out.print("Enetr the  row : ");
		int r2 = sc.nextInt();	
		System.out.print("Enter the column : ");
		int c2 = sc.nextInt();	

		int metrix2[][] = new int[r2][c2];

		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){

				metrix2[i][j] = sc.nextInt();
			}
		}

		int mul[][] = new int[r1][c2];

		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				mul[i][j] = 0;
				for(int k=0;k<c1;k++){
					mul[i][j] += metrix1[i][k] * metrix2[k][j];
				}
			}
		}
		System.out.println("Ans is : ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(mul[i][j]+" ");
			}
			System.out.println(" ");
		}

	}
}