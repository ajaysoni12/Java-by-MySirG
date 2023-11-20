public class IntializationBlock {
    private int x;  
    private static int y; 
    // instance initializaer block 
    {
        System.out.println("Instance Initialization Block, x: " + x); 
        x = 5; 
    }    

    // static initializer block 
    static 
    {
        // only access static member variable 
        System.out.println("Static Initializer Block, y: " + y); 
    }

    public IntializationBlock() {

        // initializer code will be there 
        System.out.println("Constructor, x: " + x);
    }

    public static void main(String []args) {

        // for every object instance initializer block run every time
        IntializationBlock obj1 = new IntializationBlock();
        IntializationBlock obj2 = new IntializationBlock();

        // for static initializer block run only first time 
        IntializationBlock obj3 = new IntializationBlock();
        IntializationBlock obj4 = new IntializationBlock();
    }
}
