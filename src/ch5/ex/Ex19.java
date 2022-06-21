package ch5.ex;

public class Ex19 {
    public static void main(String[] args) {
        //5명 학생의 세 과목 점수를 더해서 각 학생의 총점과 평균을 계산하고,
        //과목별 총점을 계산

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        //과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==============================");

        //개인별 총점, 평균을 구한다.
        for (int i = 0; i < score.length; i++) {
            //개인별 총점과 평균이 0으로 초기화 되도록 반복문 안에 선언
            int sum = 0;
            float avg = 0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            System.out.printf("%3d", i + 1);

            //개인별 총점, 평균을 구한다.
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            avg = sum / (float) score.length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }
        System.out.println("=================================");
        System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}
