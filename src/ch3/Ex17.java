package ch3;

public class Ex17 {
    public static void main(String[] args) {
        //Math.round()를 쓰지않고 소수점 3째자리까지 반올림해서 출력
        double pi = 3.141592;
        double shortPi = (int)(pi*1000+0.5)/1000.0;
        System.out.println("shortPi = " + shortPi);

        //Math.round()를 쓰고 소수점 3째자리까지 반올림해서 출력
        double shortPi2 = Math.round(pi*1000)/1000.0;
        System.out.println("shortPi2 = " + shortPi2);
    }
}
