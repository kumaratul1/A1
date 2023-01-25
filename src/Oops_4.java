class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int Perimeter(){
        return 2*(length+breadth);
    }
}
public class Oops_4 {
    public static void main(String[] args) {
        Rectangle Sq= new Rectangle();
        Sq.length= 2;
        Sq.breadth=4;
        System.out.println("Area of Rectangle is :"+Sq.area());
        System.out.println("Area of Rectangle is :"+Sq.Perimeter());

    }
}
