package ch5.ex;

import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        //불연속적인 범위의 값들로 배열 채우기

        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length); //0~4
            arr[i] = code[tmp]; //code의 index 0~4의 값을 arr에 저장
        }

        System.out.println(Arrays.toString(arr));
    }
}
