package ch9.ex;

import java.util.Arrays;

public class eX8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        arr[1] = 9;
        arrClone[0] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
        System.out.println(Arrays.toString(arr));
    }
}
