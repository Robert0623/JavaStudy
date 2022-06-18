package ch3;

public class Test6 {
    public static void main(String[] args) {
        //num의 값보다 크면서도 가장 가까운 10의 배수에서
        //num의 값을 뺀 나머지를 구하라
        int num = 24;

        //가볍게 계산
//        num = (num/10*10+10)-num;

        //문제의도대로 나머지연산자 사용
        num = 10 - num%10;

        System.out.println(num);
    }
}
