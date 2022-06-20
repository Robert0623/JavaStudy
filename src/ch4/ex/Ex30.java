package ch4.ex;

public class Ex30 {
    public static void main(String[] args) {
        //1부터 더해나가서 몇까지 더하면 100을 넘는지 알아내는 예제
        int i = 0;
        int sum = 0;

        while(true) {
            if(sum > 100)
                break;
            sum += ++i;

        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
