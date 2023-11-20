public class WrapperClass {
    public static void main(String[] args) {
        // convert string to wrapper class 
        Integer i1 = Integer.valueOf("123"); 
        Double d1 = Double.valueOf("12.3"); 

        // convert string to premitive type 
        int a = Integer.parseInt("232"); 
        double d = Double.parseDouble("34.5"); 

        // get value from wrapper class
        int i1_value = i1.intValue(); 
        double d1_value = d1.doubleValue(); 
    }
}
