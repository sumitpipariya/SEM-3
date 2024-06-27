	import java.util.Scanner;

public class InsertShortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Element");
        int element = sc.nextInt();
        int index=0;
        int arr[] = {1,2,3,4,5};
        
        int newArr[] = new int[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<element && arr[i+1]>=element){
                index=i+1;
            }
        }
        System.out.println("Index "+index);
        for (int i = 0; i < newArr.length; i++) {
            if(i==index){
                newArr[i] = element;
                continue;
            }
            newArr[i]=arr[j];
            j++;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }    
}


