package ch6.test;

import java.util.Arrays;

public class Test23 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("max(data) = " + max(data));
        System.out.println("max(null) = " + max(null));
        System.out.println("max(new int[]{}) = " + max(new int[]{}));
    }
    static int max(int[] arr) {
        if(arr==null || arr.length==0)
            return -999999;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])
                max = arr[i];
        }
        return max;

    }
}
