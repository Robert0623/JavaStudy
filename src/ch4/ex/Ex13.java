package ch4.ex;

public class Ex13 {
    public static void main(String[] args) {
        //아주 간단한 for문으로 합 구하는 예제
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("1부터 "+i+"까지의 합 : "+sum);
        }
        System.out.println("총합 : "+sum);
    }
}
