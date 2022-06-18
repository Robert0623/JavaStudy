package ch3;

public class Ex20 {
    public static void main(String[] args) {
        //나머지 연산자의 피연사자 중에 음수가 있을 때의 계산
        //%는 나누는 수로 음수도 허용하지만 부호는 무시됨.
        //따라서 %의 결과는 나누는 수로 양수, 음수 동일.
        //결과값의 부호는 나눠지는 수의 부호로 결정됨.
        System.out.println(-10%8); //-2
        System.out.println(10%-8); //2
        System.out.println(-10%-8); //-2

    }
}
