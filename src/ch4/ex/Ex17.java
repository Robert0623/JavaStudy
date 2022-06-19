package ch4.ex;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        //num을 입력받아서, 위에서부터 1,2,3...9,num 별찍기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
