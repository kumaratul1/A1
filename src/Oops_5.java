class Circle{
    int r;
    public double Area(){
        return 3.14*r*r;
    }
    public double Perimeter(){
        return 2*3.14*r;
    }
}
public class Oops_5 {
    public static void main(String[] args) {
        Circle C= new Circle();
        C.r= 10 ;
        System.out.println("Area of circle is :" +C.Area());
        System.out.println("Perimeter of circle is :" +C.Perimeter());

    }
}
