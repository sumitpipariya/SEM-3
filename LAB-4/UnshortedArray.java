
public class UnshortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,6};
        int arr2[] = {1,2,3,4,5,6};

        int arr3[] = new int[arr1.length + arr2.length];
        int i;
        for ( i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[i]=arr2[j];
            i++;
        }
        for (int j = 0; j < arr3.length; j++) {
            System.out.println(arr3[j]);
        }
    }
}