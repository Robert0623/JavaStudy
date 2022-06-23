package ch6.ex;

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }
    //인스턴스 복사를 위한 생성자.
    Car2(Car2 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car2(String color, String gearType, int door) {
        this.color=color;
        this.gearType=gearType;
        this.door=door;
    }
}
public class Ex26 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2(c1);
        System.out.println(c1.color+","+c1.gearType+","+c1.door);
        System.out.println(c2.color+","+c2.gearType+","+c2.door);
        c1.door = 100;
        System.out.println(c1.color+","+c1.gearType+","+c1.door);
        System.out.println(c2.color+","+c2.gearType+","+c2.door);

    }
}
