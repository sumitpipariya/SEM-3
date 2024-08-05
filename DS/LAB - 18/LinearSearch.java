import java.util.Scanner;

public class LinearSearch{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int index = -1;

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the value to find : ");
		int val = sc.nextInt();

		for(int i=0;i<n;i++){

			if(arr[i] == val){
				index = i;
				System.out.println("Index is : "+i);
				break;
			}
		}
		if(index == -1){
			System.out.println("Value not found");
		}

	}
}