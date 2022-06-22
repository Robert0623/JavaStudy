package ch5.test;

public class Test8 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i]-1]++;
        }
        //카운터를 출력
        for (int i = 0; i < counter.length; i++) {
//            String star = "";

            //내 풀이 1번방법
//            for (int j = 0; j < counter[i]; j++) {
//                star += "*";
//            }
            //내 풀이 2번방법 - 위 for문과 같다.
//            int j = 0;
//            while(j<counter[i]){
//                star += "*";
//                j++;
//            }

//            System.out.print(counter[i]+star);
            //정답지 방법
            System.out.print(counter[i]);
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
