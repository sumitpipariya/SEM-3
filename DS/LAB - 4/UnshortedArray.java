import java.util.Scanner;

public class UnshortedArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first size of Array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter second size of Array : ");
        int m = sc.nextInt();
        int arr2[] = new int[m];

        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        int ans[] = new int[n+m];

        for(int i=0;i<n;i++){
            ans[i] = arr1[i];
        }

        for(int i=0;i<m;i++){
            ans[i+n] = arr2[i];
        }

        System.out.println("Merge array is : ");
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
    }
}