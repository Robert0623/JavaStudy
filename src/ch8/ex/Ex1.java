package ch8.ex;

public class Ex1 {
    public static void main(String[] args) {
        try {
            try{} catch(Exception e) {}
        } catch(Exception e) {
//            try{} catch(Exception e) {} //에러. 변수 e가 중복선언됨.
        }
        try {

        } catch(Exception e) {

        }
    }
}
