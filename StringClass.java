public class StringClass {
    public static void main(String[] args) {
        
        // all the string reference str1, str2 & str3 denote the same object
        String str1 = "My Name is Ajay Soni"; 
        String str2 = "My Name is Ajay Soni"; 
        String str3 = "My Name is Ajay Soni"; 

        String str4 = "Ajay Soni";  // refere to new objects
        String str5 = "My Name is " + str4; // both refere to same objects
        String str6 = "My Name is Ajay Soni"; 

        // for new object every time you can write 
        String str7 = new String("My Name is Ajay Soni"); 

        String s1 = "computer"; 
        String s2 = "computer"; 
        String s3 = new String("computer"); 
        // true
        System.out.println("Result 1: " + (s1 == s2)); // reference compare
        // true
        System.out.println("Result 2: " + (s1.equals(s2))); // string compare
        // false
        System.out.println("Result 3: " + (s1 == s3)); // refernce compare
        // false
        System.out.println("Result 4: " + (s1.equals(s3))); // string compare
    }
}