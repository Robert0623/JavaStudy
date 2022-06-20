package ch5.ex;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //배열의 복사

        //배열 arr에 1~5를 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("[변경전]");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

        //복사할 배열 tmp
        int[] tmp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println("[변경후]");
        System.out.println("arr.length = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
