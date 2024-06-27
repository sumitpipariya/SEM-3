import java.util.Scanner;

public class ArrayDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter a array elemnets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();
        }
        
        boolean isContains=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("contain duplicate elements");
                    isContains=true;
                    break;
                }
            }
        }

        if(!isContains){
            System.out.println("Not Contains");
        }


    }
}