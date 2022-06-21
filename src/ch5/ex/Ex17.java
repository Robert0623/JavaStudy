package ch5.ex;

public class Ex17 {
    public static void main(String[] args) {
        if (args.length != 3) { //입력된 값의 개수가 3개가 아니면
            System.out.println("usage: java Ex17 NUM1 OP NUM2");
            System.exit(0); //프로그램 종료
        }
        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }
        System.out.println("결과:" + result);
    }
}
