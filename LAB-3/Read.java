import java.util.Scanner;

public class Read{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n[] = new int[5];

		for(int i=0;i<n.length;i++){
			n[i] = sc.nextInt();
		}
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
	}
}