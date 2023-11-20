public class ThisKeyword {
    public static void main(String []args) {
        // in every member function, this is present 
        // not present in static member function 
        Box b1 = new Box(); 
        b1.setDimension(12, 4, 5);
        b1.sendBox();
    }
}

class Box {
    private int l, b, h;  
    public void setDimension(int l, int b, int h) { 
        // this can use for access caller objects member variable 
        this.l = l; 
        this.b = b; 
        this.h = h; 
    }

    public void sendBox() {
        // when we rant to return caller object or pass call object then 
        // you can return this reference
        /*  GiftTaker gf = new GiftTaker();
            gf.acceptGift(this); 
         */
    }
}
