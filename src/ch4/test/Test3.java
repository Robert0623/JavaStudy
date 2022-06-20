package ch4.test;

public class Test3 {
    public static void main(String[] args) {
        //1+(1+2)+(1+2+3)+...+(1+2+3+...+10)의 결과를 계산하라
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            totalSum += sum;
            System.out.println("sum1 = " + sum);
            System.out.println("sum2 = " + totalSum);
        }
        System.out.println("sum1 = " + sum);
        System.out.println("sum2 = " + totalSum);
    }
}
