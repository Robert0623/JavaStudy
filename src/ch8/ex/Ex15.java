package ch8.ex;

import java.io.File;
import java.io.IOException;

public class Ex15 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() +"파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
            try {
                if (fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("오류메세지 : "+e.getMessage());
                fileName = "제목없음.txt";
            } finally {
                File f = new File(fileName);
                createNewFile(f);
                return f;
            }
        }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {
        }
    }
}

