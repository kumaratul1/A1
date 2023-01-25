import java.awt.geom.Area;
import java.util.Scanner;
class Square{
    int side;
    int Area;
    int perimeter;
    public int Area(){
        return side*side;
    }
    public int Perimeter(){
        return 4*side;

    }
}
public class Oops_3 {
    public static void main(String[] args) {

        Square Sq=new Square();
      Sq.side=15;
      System.out.println("Area of the Square is :"+Sq.Area());
      System.out.println("Perimeter of the Square is :"+ Sq.Perimeter());

    }
}
