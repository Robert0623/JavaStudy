package ch7.ex;

public class Ex13 {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        t.setHour(t.getHour() + 1);
        System.out.println("t = " + t);
    }
}
class Time {
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    };

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(!(0<=hour && hour<=23)) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(!(0<=minute && minute<=59)) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(!(0<=second && second<=59)) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}