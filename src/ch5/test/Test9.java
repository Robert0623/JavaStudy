package ch5.test;

public class Test9 {
    public static void main(String[] args) {
        char[][] star =  {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };
        //5x4 2차원 배열을 선언
        char[][] result = new char[star[0].length][star.length];

        //star를 출력
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                //좌표를 그림으로 그려서 규칙 찾기
                int x = j;
                int y = star.length-1-i;

                result[x][y] = star[i][j];
            }
        }

        //결과 result 출력
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
