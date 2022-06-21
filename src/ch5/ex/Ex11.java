package ch5.ex;

public class Ex11 {
    public static void main(String[] args) {
        //해당 인덱스의 값이 몇 번 나타났는지 확인하는 예제

        int[] numArr = new int[10]; //임의의 값 저장
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10); //0~9 임의의 수로 초기화
            System.out.print(numArr[i]+",");
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }

    }
}
