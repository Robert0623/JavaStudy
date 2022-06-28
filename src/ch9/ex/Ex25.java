package ch9.ex;

public class Ex25 {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = (Integer) i;
        Object obj = (Object) i;

        Long lng = 100L;
        int i2 = intg + 10;
        long l = intg + lng;

        Integer intg2 = new Integer(20);
        int i3 = (int) intg2;

        Integer intg3 = intg2 + i3;
    }
}
