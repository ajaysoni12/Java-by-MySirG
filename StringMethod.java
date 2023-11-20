public class StringMethod {
    public static void main(String[] args) {

        // toUpperCase() & toLowerCase() 
        String s1 = "Computer"; 
        String upper_s1 = s1.toUpperCase();  
        String lower_s1 = s1.toLowerCase();  
        System.out.println(s1 + " " + upper_s1 + " " + lower_s1); 

        // indexOf() & lastIndexOf()
        String s2 = "Computer";  
        int index = s2.indexOf('m');  
        System.out.println("Index of m is: " + index);  // 2
        index = s2.indexOf('m', 3); 
        System.out.println("Index of m is: " + index);  // -1
        index = s2.indexOf("uter", 3); 
        System.out.println("Index of m is: " + index);  // 4
        index = s2.lastIndexOf('m'); // right to left search
        System.out.println("Index of m is: " + index);  // 2

        // compare string 
        String s3 = "Computer"; 
        String s4 = "computer";   

        // equals() - with case sensitive
        if(s3.equals(s4)) 
            System.out.println("String are same");
        else 
            System.out.println("String are same"); // this line print 
        
        // equalsIgnoreCase() - without case sensitive
        if(s3.equalsIgnoreCase(s4)) 
            System.out.println("String are same"); // this line print 
        else 
            System.out.println("String are same");

        int res = s3.compareTo(s4);  
        // res == 0  // string are same 
        // res >  0 // string are opposite of dictionary order
        // res < 0 // string are according to dictionary order  
        

        // substring()
        String s5 = "Computer"; 
        String sub_str1 = s5.substring(3); 
        String sub_str2 = s5.substring(2, 6); // 2 - include, 6 - exclude 
    }
}
