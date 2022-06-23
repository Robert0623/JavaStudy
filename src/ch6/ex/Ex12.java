package ch6.ex;

public class Ex12 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sumArr(arr) = " + sumArr(arr));
    }
    //향상된 for문으로 배열 출력
    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }
    //배열의 합계
    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //버블정렬로 오름차순
    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
