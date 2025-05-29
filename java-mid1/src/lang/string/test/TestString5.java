package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // TODO indexOf()와 substring()을 사요앟여 파일명과 확장자를 분리하라.
        int i = str.indexOf(ext);
        String filename = str.substring(0, i);
        String extName = str.substring(i);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
