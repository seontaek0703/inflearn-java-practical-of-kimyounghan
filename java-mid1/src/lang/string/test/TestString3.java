package lang.string.test;

public class TestString3 {

    public static void main(String[] args) {
        String str = "hello.txt";
        // TODO: str에서 .txt 문자열이 언제부터 시작하는지 indexOf()를 사용하여 위치를 찾아 출력하라.
        int i = str.indexOf(".txt");
        System.out.println("i = " + i);
    }
}
