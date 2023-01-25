class cylinder{
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
    public double surfaceArea(){
        return 2*Math.PI*radius*radius +2*Math.PI*radius*height;
    }
    public double Volume(){
        return 2*Math.PI*radius*radius*height;
    }

}
public class Getter_1 {
    public static void main(String[] args) {
        cylinder myCylinder= new cylinder();
        myCylinder.setRadius(3);
        int n = myCylinder.getRadius();
        System.out.println("Radius of Cylinder is : "+n);
        myCylinder.setHeight(4);
        int i = myCylinder.getHeight();
        System.out.println("Height of cylinder ="+i);
        System.out.println("Surface Area of cylinder is :"+ myCylinder.surfaceArea());
        System.out.println("Volume of Cylinder is : "+myCylinder.Volume());

    }
}
