import java.util.Scanner;

public class ArrayDelete{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter the size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("Enetr the index to Delete value : ");
		int index = sc.nextInt();

		int ans[] = new int[n];

		for(int i=0;i<index;i++){
			ans[i] = arr[i];
			System.out.println(ans[i]);
		}

		for(int i=index+1; i<ans.length; i++){
			ans[i] = arr[i];
			System.out.println(ans[i]);
		}

	}
}