import java.util.Scanner;

public class QuickSort{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Array size : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int a=0;a<n;a++){
			arr[a] = sc.nextInt();
		}

		Quick_Sort(arr,0,arr.length-1);

		for(int i=0 ;i<n;i++){
			System.out.print(arr[i]+",");
		}

	}

	static void Quick_Sort(int arr[],int lb, int ub){
		if(lb < ub){
			boolean flag = true;
			int i = lb;
			int j = ub+1;
			int key = arr[lb];

			while(flag){
				i++;

				while (i < arr.length  && arr[i] < key) {
					
					i++;

				}
					j--;

				while (j >=0 && arr[j] > key) {
					j--;
				}
				if(i<j){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				else{
					flag = false;
				}


			}
				int temp = arr[lb];
				arr[lb] = arr[j];
				arr[j] = temp;

		Quick_Sort(arr,lb,j-1);
		Quick_Sort(arr,j+1,ub);
		}



	}

}