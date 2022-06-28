package ch9.ex;

public class Ex19 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01"); //버퍼크기 16, 문자열 "01"저장

        StringBuffer sb2 = sb.append(23); //버퍼크기 16, "0123"
        sb.append('4').append(56); //"0123456"
        StringBuffer sb3 = sb.append(78); //"012345678"
        sb3.append(9.0); //"0123456789.0"

        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        System.out.println("sb.deleteCharAt(10) = " + sb.deleteCharAt(10)); //"01234567890"
        System.out.println("sb.delete(3,6) = " + sb.delete(3, 6)); //"01267890"
        System.out.println("sb.insert(3, \"abc\") = " + sb.insert(3, "abc")); //"012abc67890"
        //"012abcEND"
        System.out.println("sb.replace(6, sb.length(), \"END\") = " + sb.replace(6, sb.length(), "END"));
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());
    }
}
