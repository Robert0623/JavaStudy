//package ch7.test;
//
//public class Test15 {
//    public static void main(String[] args) {
//        Unit u = new GroundUnit();
//        Tank t = new Tank();
//        AirCraft ac = new AirCraft();
//
////       a. u = (Unit)ac; //u = (Unit) new AirCraft();와 같다.
////       b. u = ac; //u = new AirCraft(); - 업캐스팅이므로 (Unit)생략가능
////       c. GroundUnit gu = (GroundUnit) u; //GroundUnit gu = (GroundUnit) new GroundUnit();과 같다.
////       d. AirUnit au = ac; //AirUnit au = new AirCraft();와 같다. - 업캐스팅
////       e. t = (Tank) u; //t = (Tank) new GroundUnit();와 같다. - 조상인 GroundUnit인스턴스를 자손인 Tank로 형변환 불가!
////       f. GroundUnit gu2 = (GroundUnit) t; //Ground gu2 = (GroundUnit) new Tank(); - 업캐스팅
//
//    }
//}
//class Unit {}
//class AirUnit extends Unit {}
//class GroundUnit extends Unit {}
//class Tank extends GroundUnit {}
//class AirCraft extends AirUnit {}
//
