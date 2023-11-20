public class ConstructorInheritance {

    public static void main(String[] args) {
        B obj = new B(); 
        // First A class constructor print 
        // Then B class constructor print
    }
}

class A {
    int x; 
    public A() { x = 5; System.out.println("Construct A"); }
}
class B extends A {
    int y; 
    
    // automatic call by compiler parent class constructor
    // we need argument in A class constructor so compiler give error
    // so we need to class parent class constructor manually 
    public B() { System.out.println("Construct B"); }

    // manually call constructor of parent class 
    /*
    public B() {
        // pass one argument in parent class constructor
        super(5); // write in first line always, otherwise error occur
        System.out.println("Construct B");
    }
    */
}