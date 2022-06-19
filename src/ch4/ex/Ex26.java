package ch4.ex;

public class Ex26 {
    public static void main(String[] args) {
        //1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰수가 되는가?
        int i = 0;
        int sum = 0;

        while ((sum += ++i) <= 100) {

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
        }
    }
}
