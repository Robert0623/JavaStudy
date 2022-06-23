package ch6.ex;

class Data5 {
    int value;
}
class Data6 {
    int value;
    Data6(int x) {
        value = x;
    }
}

public class Ex23 {
    public static void main(String[] args) {
        Data5 d1 = new Data5();
        Data6 d2 = new Data6(3);
    }
}
