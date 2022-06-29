package ch9.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.*;

public class Ex26 {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        for(String[] tmp : str2D)
            System.out.println(Arrays.toString(tmp));

        System.out.println("Objects.equals(str2D, str2D2) = " + Objects.equals(str2D, str2D2));
        System.out.println("Objects.deepEquals(str2D, str2D2) = " + Objects.deepEquals(str2D, str2D2));

        System.out.println("isNull(null) = " + isNull(null));
        System.out.println("nonNull(null) = " + nonNull(null));
        System.out.println("Objects.hashCode(null) = " + Objects.hashCode(null));
        System.out.println("Objects.toString(null) = " + Objects.toString(null));
        System.out.println("Objects.toString(null, \"\") = " + Objects.toString(null, ""));
        Comparator c = String.CASE_INSENSITIVE_ORDER; //대소문자 구분 안하는 비교
        System.out.println("compare(\"aa\",\"bb\",c) = " + compare("aa", "bb", c));
        System.out.println("compare(\"bb\",\"aa\",c) = " + compare("bb", "aa", c));
        System.out.println("compare(\"ab\",\"AB\",c) = " + compare("ab", "AB", c));

    }
}
