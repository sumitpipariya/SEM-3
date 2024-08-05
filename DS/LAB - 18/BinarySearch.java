import java.util.Scanner;

public class  BinarySearch{

	public static void main(String[] args) {
		
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();

		}

		int left = 0;
		int right = n-1;
		int middle = 0;

		System.out.print("Enter find the value : ");
		int val = sc.nextInt();

		while(left<right){
			middle = (left+right)/2;
			if(arr[middle]==val){
				System.out.println("Index is : "+middle);
				return;
			}
			else if(arr[middle]>val){
				right = middle-1;
				
			}
			else if(arr[middle]<val){
				left = middle+1;
			
				
			}
			else{
				System.out.println("Not found");
				
			}
		}


		



	}

}