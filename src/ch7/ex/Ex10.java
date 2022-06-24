package ch7.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("date.format(today) = " + date.format(today));
        System.out.println("time.format(time) = " + time.format(today));
    }
}
