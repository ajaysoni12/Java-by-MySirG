import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter you name & age: "); 

        // System.in is a reference who connect keyboard  
        // Scanner class read data from buffer 
        // .next...() function convert that data into desire data 

        Scanner sc = new Scanner(System.in); 
        String name = sc.nextLine(); 
        int age = sc.nextInt(); 

        System.out.println("Name: " + name + " Age: " + age);
    }
}
