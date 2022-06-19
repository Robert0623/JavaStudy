package ch3.ex;

public class Ex32 {
    public static void main(String[] args) {
        //정수를 절대값으로 바꾸고, 원래 정수의 부호를 문자로 앞에 붙임.
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x=10;
        y=-5;
        z=0;

        //x, y, z를 양수로 만듬
        //삼항연산자
        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        //양수면 '+', 음수면 '-', 0은 ' '를 앞에 붙임
        //삼항연산자 중첩
        signX = x > 0 ? '+' : (x < 0 ? '-' : ' ');
        signY = y > 0 ? '+' : (y < 0 ? '-' : ' ');
        signZ = z > 0 ? '+' : (z < 0 ? '-' : ' ');

        System.out.println("signX+absX = " + signX + absX);
        System.out.println("signY+absY = " + signY + absY);
        System.out.println("signZ+absZ = " + signZ + absZ);
    }
}
