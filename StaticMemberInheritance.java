public class StaticMemberInheritance {

    public static void main(String[] args) {
        B obj = new B(); 
        obj.f1();
    }

}
class A {
    // member variable can't inherit
    public static int x = 5; 

    // it can inherit 
    public static void f1() {

    }
}
class B extends A {
    // you can hide definition of f1, so it's call function hiding
    // if function is static 

    // you can also hide definition of static, using initialization block 
}
