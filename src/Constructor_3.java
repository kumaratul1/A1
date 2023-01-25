class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*(radius*radius);
    }
    public double volume(){
        return 1.333*Math.PI*radius*radius*radius;           // 4/3= 1.333
    }
}
public class Constructor_3 {
    public static void main(String[] args) {
        Sphere S =new Sphere();
        S.setRadius(6);
        System.out.println("Radius of sphere is :"+ S.getRadius());
        System.out.println("Surface Area of Sphere : "+S.surfaceArea());
        System.out.println("Volume of Sphere : "+S.volume());

    }
}
