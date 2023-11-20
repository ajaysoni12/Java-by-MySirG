// example addmission, 
interface I1 {
    public void f1(); 
}
interface I2 {
    public void f2();
}
interface I3 extends I1, I2 {
    public void f3();
}
interface I4 {
    public void f4();
}
class A  {

}
class B extends A implements I3, I4 {
    public void f1() { }
    public void f2() { }
    public void f3() { }
    public void f4() { }
}

public class Interface {
    public static void main(String[] args) {
        B obj = new B(); 
        obj.f1();
        obj.f2();
        obj.f3();
        obj.f4();

        I3 obj1 = new B();  // you can create reference of interface
        obj1.f1();
        obj1.f2();
        obj1.f3();
        // obj1.f4(); // error, only access parent method, similar to abstract class
    }   
}
