public class TwoDArrays {
    public static void main(String[] args) {
        int [][]arr1 = new int[4][5]; 
        int arr2[][] = new int[4][5]; 

        /*           
        int [][]arr = new int[][];  -> error
        int [][]arr = new int[][5]; -> error
        int [][]arr = new int[4][]; -> correct
        */

        int [][]arr = new int[][] {{3, 4}, {5, 6}, {7, 8}}; 

        int [][]arr3 = new int[4][]; 
        arr3[0] = new int[5]; 
        arr3[1] = new int[5];
        System.out.println("Length: " + arr3[1].length); 

    }
}
