package ch5.ex;

public class Ex5 {
    public static void main(String[] args) {
        //총합과 평균
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
