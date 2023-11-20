public class Static003 {
    
    int x; // instance variable 
    static int y; // static member variable 

    public void fun1() { } // instance member function 
    public static void fun2() { } // static member function 
    // static member function, only access static variable 

    // you declare static variable inside instance member function 

    // static inner class 
    static class Test {
        public static String country = "INDIA"; 
    }

    public static void main(String []args) {
        // x create two time, but y not dependent on objects
        // y create only one time, by default int value is zero 
        Static003 obj1 = new Static003(); 
        Static003 obj2 = new Static003(); 

        // you can't access static through objects 
        Static003.y = 5; // you can't access directly because it is in same class 
        Static003.fun2();

        System.out.println(Static003.Test.country); 

    }
    
}
