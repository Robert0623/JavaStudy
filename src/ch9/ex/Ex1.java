package ch9.ex;


public class Ex1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1; //v1의 주소를 v2에 대입 --> v1, v2가 같은 객체를 가리킴.

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}
class Value {
    int value;
    Value(int value) {
        this.value=value;
    }
}
