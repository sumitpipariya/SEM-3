	import java.util.Scanner;

public class InsertShortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Shorted array is : ");
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){       
               if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
               }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.print("Enter Insert Element : ");
        int insert = sc.nextInt();

        int ans[] = new int[n+1];

        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i];
        }

        for(int i=0;i<ans.length;i++){
            ans[n] = insert;
        }

        for(int i=0;i<ans.length;i++){
            for(int j=i+1;j<ans.length;j++){       
               if(ans[i] > ans[j]){
                temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
               }
            }
        }

        System.out.println("New Insert Sort Array is : ");
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
 }    


