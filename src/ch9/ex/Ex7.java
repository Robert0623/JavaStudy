//package ch9.ex;
//
//public class Ex7 {
//    public static void main(String[] args) {
//        Point original = new Point(3, 5);
//        Point copy = (Point) original.clone();
//        System.out.println(original);
//        System.out.println(copy);
//    }
//}
//class Point implements Cloneable {
//    int x,y;
//
//    Point(int x, int y) {
//        this.x=x;
//        this.y=y;
//    }
//
//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
//    public Object clone() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e) {
//        }
//        return obj;
//    }
//}
