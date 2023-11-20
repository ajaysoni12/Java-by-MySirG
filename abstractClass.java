public class abstractClass {
    public static void main(String[] args) {
        // Person obj = new Person(); can't create object of abstract class 
        // but you can created reference of abstract class 
        // you can only access parent class method and variable 
        Person obj = new Student(); 
        obj.setName("ajay");
        obj.setAge(28);
    }
}
abstract class Person {
    private String name; 
    private int age; 
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}
class Student extends Person {

}