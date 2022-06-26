package ch7.test;

public class Test17 {
    public static void main(String[] args) {

    }
}
class Marine extends Unit {
    void move(int x, int y) {}
    void stimPack() {}
}
class Tank extends Unit {
    void move(int x, int y) {}
    void changeMode() {}
}
class DropShip extends Unit {
    void move(int x, int y) {}
    void load() {}
    void unload() {}
}
abstract class Unit {
    int x, y; //현재 위치
    abstract void move(int x, int y); //지상, 공중유닛별로 다르므로 각자 구현하도록 한다.
    void stop() { /* 현재 위치에 정지 */ }
}
