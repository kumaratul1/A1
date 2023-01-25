class circle {
    private int radius;

    public circle(int radius) {
        this.radius = radius;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
}

public class Constructor_4 {
    public static void main(String[] args) {
        circle myCircle= new circle(5);
        System.out.println("Radius of Circle is : "+myCircle);
        System.out.println("Circumference of circle is : "+myCircle.Circumference());
        System.out.println("Area of Circle is : "+myCircle.Area());


    }
}
