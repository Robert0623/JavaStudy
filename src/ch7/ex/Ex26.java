package ch7.ex;

public class Ex26 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        Scv scv = new Scv();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}
interface Repairable {}
class MyUnit {
    int hitPoint;
    final int MAX_HP;
    MyUnit(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends MyUnit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends MyUnit {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class Scv extends GroundUnit implements Repairable {
    Scv() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof MyUnit) {
            MyUnit u = (MyUnit)r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u+"의 수리가 끝났습니다.");
        }
    }
}
