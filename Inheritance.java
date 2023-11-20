public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.setRollno(001);
        s1.setName("Ajay Soni"); 
        s1.setAge(19);

        System.out.println("Roll No: " + s1.getRollno());
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
class Person {
    private String name; 
    private int age; 
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
}
class Student extends Person {
    private int rollNo; 
    public void setRollno(int r) { rollNo = r; }
    public int getRollno() { return rollNo; }
}