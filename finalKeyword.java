public class finalKeyword {
    private final int x = 5; // final instance member variable, by default blank
    // direct initialize, block, constructor

    private final static int y = 5; // final staic member variable 
    // only direct & block 

    public void fun() {
        final int k = 3; // final local variable 
        // can't alter, by default blank 
    }
}
// final class: if this class if final, then we can't inherit this class 
class Dummy {
    // final method: can't override this method
    public final void f1() { }
}
