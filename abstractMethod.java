public class abstractMethod {
    public static void main(String[] args) {
        Student obj = new Student(); 
        obj.show();
    }
}
abstract class Person {
    public abstract void show();    
}
class Student extends Person {
    // if you don't override then declare student class is abstract and 
    // you can't create objects of that class
    public void show() {
        // example 
        // account class - saving acconut child class, abstract method 
        // caclulate intreset 
    }
}
