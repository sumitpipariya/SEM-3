import java.util.Scanner;

public class ShellSort{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Size of array : ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		int gap,temp;

		for(gap = n/2; gap >= 1;gap = gap/2){
			for(int j = gap; j<n;j++){
				for(int i = j-gap; i >=0 ;i =i-gap){
					if(arr[i+gap] > arr[i]){
						break;
					}
					else{
						temp = arr[i+gap];
						arr[i+gap] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}

		System.out.println("Sortrd array is :");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}
}