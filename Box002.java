package pack2; 
public class Box002 {
    
    public static void main(String []args) {
        Box smallBox = new Box(); 
        smallBox.setDimension(10, 12, 5);
        smallBox.showDimension(); 
        smallBox = new Box();  
        smallBox.showDimension();
    }
   
}
class Box {
    private int length, breath, height;  
    public void setDimension(int l, int b, int h) {
        length = l; 
        breath = b; 
        height = h ; 
    }
    public void showDimension() {
        System.out.println("L = " + length);
        System.out.println("B = " + breath);
        System.out.println("H = " + height); 
    }
}  
