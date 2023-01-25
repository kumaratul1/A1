//constructor OverLoading
class Rectangle1{
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }


    public Rectangle1(){
        this.length=4;
        this.breadth=5;
    }
    public Rectangle1(int length, int breadth){
        this.length=length;
        this.breadth=breadth;

    }

}
public class Constructor_2 {
    public static void main(String[] args) {
        Rectangle1 myRectangle= new Rectangle1();
        System.out.println("Length : "+myRectangle.getLength());
        System.out.println("Breadth : " +myRectangle.getBreadth());


    }
}
