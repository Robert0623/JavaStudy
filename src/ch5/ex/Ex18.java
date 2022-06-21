package ch5.ex;

public class Ex18 {
    public static void main(String[] args) {
        //2차원 배열의 모든 요소의 합을 구하고, 출력

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score["+i+"]["+j+"] = " + score[i][j]);
            }
        }
        //향상된 for문으로 score의 모든 요소의 합을 구함
        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
