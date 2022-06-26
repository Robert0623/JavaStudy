package ch7.test;


import org.w3c.dom.css.Rect;

public class Test22 {
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Circle){
                Circle c = (Circle) arr[i];
                sum += c.calcArea();
            }
            else if(arr[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) arr[i];
                sum += r.calcArea();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("sumArea(arr) = " + sumArea(arr));
    }
}
abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0, 0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x, y;
    Point() {
        this(0,0);
    }

    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
class Circle extends Shape {
    double r;
    Circle(double r) {
        this(new Point(), r);
    }
    Circle(Point p, double r) {
        super(p);
        this.r=r;
    }
    double calcArea() {
        return Math.PI * r * r;
    }
}
class Rectangle extends Shape {
    double width;
    double height;
    Rectangle(double width, double height) {
        this(new Point(), width, height);
    }
    Rectangle(Point p, double width, double height) {
        super(p);
        this.width=width;
        this.height=height;
    }
    double calcArea() {
        return width * height;
    }
    boolean isSquare() {
        return width*height!=0 && width==height;
    }
}
