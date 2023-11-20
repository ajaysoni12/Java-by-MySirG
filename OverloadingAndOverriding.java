public class OverloadingAndOverriding {
    public static void main(String []args) {
        A obj1 = new A();  
        obj1.f1(5); 
        obj1.f1(5, 3);

        B obj2 = new B(); 
        obj2.f4(5); // sprots car shift gear mechnaism
    }
}
class A {
    
    // method overloading 
    public void f1(int x) {
        System.out.println("Overloading f1(x)");
    }
    public void f1(int x, int y) {
        System.out.println("Overloading f1(x, y)");
    }
    public void f3(int x) {
        System.out.println("Overloading f3(x)");
    }

    // method overriding
    public void f4(int x) {
        System.out.println("Overriding f4(x)");
    }
}

class B extends A {

    // method overloading 
    public void f2(int x) {
        System.out.println("Overloading f2(x)");
    }
    public void f2(int x, int y) {
        System.out.println("Overloading f2(x, y)");
    }
    public void f3(int x) {
        System.out.println("Overloading f3(x)");
    }

    // method overriding
    // method overriding
    public void f4(int x) {
        System.out.println("Overriding f4(x)");
    }
}