package ch7.ex;

public class Ex8 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println("p3.getLocation() = " + p3.getLocation());
    }
}
class Point2 {
    int x=10, y=20;

    Point2() {}
    Point2(int x, int y) {
        this.x=x;
        this.y=y;
    }
    String getLocation() {
        return "x :"+x+", y : "+y;
    }
}
class Point3D extends Point2 {
    int z=30;

    Point3D() {
        this(100, 200, 300);
    }
    Point3D(int x, int y, int z) {
        super(x,y);
//        this.x=x;
//        this.y=y;
        this.z=z;
    }
    String getLocation() {
        return super.getLocation() + ", z : "+z;
    }
}