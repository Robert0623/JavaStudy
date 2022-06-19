package ch4.ex;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        //구구단 출력
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+" * "+j+" = "+ (i*j));
            }
        }
    }
}
