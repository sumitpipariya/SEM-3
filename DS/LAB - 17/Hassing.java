import java.util.*;

public class Hassing{
	static int[] hash = new int[20];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elemenr of array : ");

		int [] arr = new int[15];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		store(arr);
		System.out.println(Arrays.toString(hash));

	}

	public static void store(int arr[]){
		int index;
		for(int i=0;i<arr.length;i++){
			index = hash(arr[i]);
			hash[index]= arr[i];
		}
	}


	public static int hash(int n)
	{
		int index = (n % 18) + 2;
		if(hash[index] !=0){
			while(hash[index]!=0){
				index = (++index) %20;
			}
		}
		return index;
	}

}