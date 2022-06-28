package ch9.ex;

public class Ex23 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("(i==i2) = " + (i == i2)); //false
        System.out.println("i.equals(i2) = " + i.equals(i2)); //equals()오버라이딩 되어있음. true
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2)); //0
        System.out.println("i.toString() = " + i.toString()); //toString()오버라이딩 되어있음.100

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.SIZE = " + Integer.SIZE);
        System.out.println("Integer.TYPE = " + Integer.TYPE);
    }
}
