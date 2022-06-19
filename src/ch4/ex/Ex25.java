package ch4.ex;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        //각 자리의 합을 구하라
        //1. 값을 입력받는다.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        //2. 반복문으로 처리
        while (num > 0) {
            sum += num%10;

            num /= 10;
        }
        System.out.println("각 자리수의 합 : "+sum);
    }
}
