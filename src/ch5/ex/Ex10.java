package ch5.ex;

public class Ex10 {
    public static void main(String[] args) {
        //배열의 정렬 - 버블정렬 이용해서 오름차순으로

        int[] numArr = new int[10];

        //0~9로 numArr을 초기화
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false; //자리바꿈이 발생했는지를 체크

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) { //옆의 값이 작으면 서로 바꾼다
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true; //자리바꿈 발생했으니 true로
                }
            }

            if(!changed) break; //자리바꿈이 없으면 break

            //정렬된 결과를 출력
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
