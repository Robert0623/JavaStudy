package ch5.ex;

public class Ex6 {
    public static void main(String[] args) {
        //최대값, 최소값
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
