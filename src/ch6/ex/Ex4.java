package ch6.ex;

class Tv3 {
    String color;
    boolean power;
    int channel;

    void power() {power=!power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
public class Ex4 {
    public static void main(String[] args) {
        Tv3[] tvArr = new Tv3[3]; //길이가 3인 Tv3 객체배열

        //Tv3객체를 생성해서 Tv3객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv3();
            tvArr[i].channel = i + 10; //tvArr[i]의 channel에 i+10을 저장
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println("tvArr["+i+"].channel = " + tvArr[i].channel);
        }

    }
}
