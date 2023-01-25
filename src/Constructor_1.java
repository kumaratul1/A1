//Volume and Surface Area of Cylinder using constructor
class Cylinder1{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
    return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Cylinder1(int radius,int height){
        this.radius= radius;
        this.height= height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius +2*Math.PI*radius*height;
    }    public double Volume(){
        return 2*Math.PI*radius*radius*height;
    }
}
public class Constructor_1 {
    public static void main(String[] args) {
    Cylinder1  myCylinder= new Cylinder1(4,5);
    System.out.println("Radius is : "+myCylinder.getRadius());
    System.out.println("Height is :"+myCylinder.getHeight());
    System.out.println("Surface Area is : "+myCylinder.surfaceArea());
    System.out.println("Volume is : "+myCylinder.Volume());


    }
}
