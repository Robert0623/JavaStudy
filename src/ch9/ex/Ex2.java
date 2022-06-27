package ch9.ex;

public class Ex2 {
    public static void main(String[] args) {
        Person p1 = new Person(111L);
        Person p2 = new Person(111l);

        if(p1==p2)
            System.out.println("p1과 p2는 같은사람입니다.");
        else
            System.out.println("p1과 p2는 다른사람입니다.");
        if(p1.equals(p2))
            System.out.println("p1과 p2는 같은사람입니다.");
        else
            System.out.println("p1과 p2는 다른사람입니다.");
    }
}
class Person {
    long id;
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }
    Person(long id) {
        this.id = id;
    }
}
