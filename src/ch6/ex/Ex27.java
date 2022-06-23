package ch6.ex;

public class Ex27 {
    static {
        System.out.println("static { }"); //1
    }
    {
        System.out.println("{ }"); //3, 6
    }
    public Ex27() {
        System.out.println("생성자"); //4, 7
    }
    public static void main(String[] args) {
        System.out.println("Ex27 ex = new Ex27(); "); //2
        Ex27 ex = new Ex27();

        System.out.println("Ex27 ex2 = new Ex27(); "); //5
        Ex27 ex2 = new Ex27();
    }
}
