package ch6.test;

public class Test24 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("abs(value) = " + abs(value));
        value = -10;
        System.out.println("abs(value) = " + abs(value));
    }

    static int abs(int value) {
        return value >= 0 ? value : -value; //아래 4줄과 같다.
//        if(value<0)
//            return -value;
//        else
//            return value;
    }
}