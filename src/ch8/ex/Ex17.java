package ch8.ex;

public class Ex17 {
    public static void main(String[] args) {
        try {
            startInstall(); //인스톨 실행
            copyFiles(); //파일 복사
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles(); //프로그램 설치에 사용된 임시파일을 삭제
        }
    }
    static void startInstall() {}
    static void copyFiles() {}
    static void deleteTempFiles() {}
}
