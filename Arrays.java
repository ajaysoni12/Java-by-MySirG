import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int arr[5]; - error 
        int []arr1 = new int[5]; // here arr1 is reference variable who contains reference of arr, inside arr have one length variable also
        int arr2[] = new int[5]; 

        int arr3[] = new int[] {2, 3, 4, 5, 6}; 
        // int arr4[] = new int[2] {2, 3, 6}; - error
        // int arr5[] = new int[3] {1, 2} - you can not mention size & value together 

        int arr6[] = {2, 3, 5}; 

        // by default 0 value initialized
        int arr[] = new int[5]; 
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter 5 numbers: "); 
        for(int i = 0; i < 5; i++) 
            arr[i] = sc.nextInt(); 
        
        for(int i = 0; i < 5; i++) 
            System.out.println("arr["+i+"]" + arr[i]); 
    }
}
