import java.util.Scanner;

public class SelectionSort{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<n-1;i++){
			int min_index = i;
			for(int j=i+1; j<n;j++){
				if(arr[j] < arr[min_index]){
					min_index = j;
				}
			}
			if(min_index != i){
					int temp = arr[i];
					arr[i] = arr[min_index];
					arr[min_index] = temp;
				}
		}

		System.out.println("Sorted Array is :-----------");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}

}