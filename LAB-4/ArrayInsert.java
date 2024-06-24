import java.util.Scanner;

public class ArrayInsert{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter the size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("Enetr the index to change value : ");
		int index = sc.nextInt();
		System.out.print("Enter the new value: ");
		int value = sc.nextInt();

		int ans[] = new int[n+1];

		for(int i=0;i<index;i++){
			ans[i] = arr[i];
			System.out.println(ans[i]);
		}

		ans[index] = value;
		System.out.println(ans[index]);

		for(int i=index+1; i<ans.length; i++){
			ans[i] = arr[i];
			System.out.println(ans[i]);
		}
	}
}