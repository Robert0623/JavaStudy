package ch7.test;

public class Test16 {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        //a. fe instanceof FireEngine //true - 자기자신
        //b. fe instanceof Movable2 //true - 조상
        //c. fe instanceof Object //true - 최고조상
        //d. fe instanceof Car //true - 조상
        //e. fe instanceof Ambulance //false - 자손끼리는 형변환 불가
    }
}
class Car {}
class FireEngine extends Car implements Movable2 {}
class Ambulance extends Car {}

interface Movable2 {}

