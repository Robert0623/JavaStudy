package ch6.ex;

import java.util.Arrays;

public class Ex28 {
    static int[] arr = new int[10];
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Ex28.arr));
    }
}
