package ch6.test;

public class Test8 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println("p.getDistance(2,2) = " + p.getDistance(2, 2));
    }
}
class MyPoint {
    int x;
    int y;

    MyPoint() {}
    MyPoint(int x, int y) {
        this.x=x;
        this.y=y;
    }
    double getDistance(int x1, int y1) {
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
    }
}