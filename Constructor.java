public class Constructor {

    int length, breath, height; 
    
    // construct overloading 
    public Constructor() { length = 0; breath = 0; height = 0; }
    public Constructor(int l, int b, int h) {
        length = l; breath = b; height = h; 
    }


    public static void main(String[] args) {
        Constructor obj = new Constructor(4, 3, 5); 
    }

}