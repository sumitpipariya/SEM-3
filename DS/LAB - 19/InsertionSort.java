import java.util.Scanner;

public class InsertionSort{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int a = 0;a<n;a++){
			arr[a] = sc.nextInt();
		}

		int i = 1;
		while(i<n){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			i++;
		}

		System.out.println("Sorted array is :----------");
		for(int a=0;a<n;a++){
			System.out.println(arr[a]);
		}
	}

}