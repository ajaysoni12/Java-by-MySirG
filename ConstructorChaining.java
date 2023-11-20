class A {
    public A() {
        System.out.println("Construct A 1");
    }
}
class B extends A {
    public B() {
        this(4); 
        System.out.println("Construct B 1");
    }
    public B(int x) { 
        // compiler write super() method here to call parent class constructor
        System.out.println("Construct B 2");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        B obj = new B(); 
        // output: 
        // A1, B2, B1
    }
}
