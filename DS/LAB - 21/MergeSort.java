import java.util.Scanner;

public class MergeSort{
	static int arr[];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		arr = new int[size];

		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		merge_Sort(0,size-1);
		System.out.println("Sorted Array");

		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}

	public static void merge_Sort(int low,int high){
		if(low<high){
			int mid = (high+low)/2;
			merge_Sort(low,mid);
			merge_Sort(mid+1,high);
			merge(low,mid,high);
		}
	}

	public static void merge(int low,int mid,int high){

		int h = low, i = low, j = mid+1,k;

		int[] arr2 = new int[high+1];

		while(h<=mid && j<=high){
			if(arr[h] <= arr[j]){
				arr2[i] = arr[h];
				h++;
			}
			else{
				arr2[i] = arr[j];
				j++;
			}
			i++;
		}

		if(h>mid){
			for(k = j; k<=high; k++){
				arr2[i] = arr[k];
				i++;
			}
		}
		else{
			for(k = h; k<=mid; k++){
				 arr2[i] = arr[k];
				i++;
			}
		}
		// for(int i=low;i<high;i++){
		// 	System.out.println(arr[i]);
		// }
		for(k = low; k<=high;k++){
			arr[k] = arr2[k];
		}
	}
}