package pack1; 
import pack2.Box; 

public class ImportKeyword {
    public static void main(String []args) {
        Box smallBox = new Box(); 
        smallBox.setDimension(2,3,4); 
        smallBox.showDimension();
    }
}
