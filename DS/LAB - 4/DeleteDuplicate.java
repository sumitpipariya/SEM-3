import java.util.Scanner;

public class DeleteDuplicate{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		int ans[] = new int[n];

		for(int i=0;i<n;i++){
			ans[i] = arr[i];
		}
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(ans[i] > ans[j]){
					temp = ans[i];
					ans[i] = ans[j];
					ans[j] = temp;
				}
			}
		}

		System.out.println("New array is :");
		int j = 1;

		for(int i=0;i<ans.length-1;i++){
			if(ans[i] != ans[i+1]){
				ans[j] = ans[i+1];
				j++;
			}
		}

		for(int i=0;i<j;i++){
			System.out.println(ans[i]);
		}

	}
}