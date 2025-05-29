package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "http://www.example.com";
        // TODO: startsWith()를 사용해 url이 http://로 시작하는지 확인하라
        boolean b = url.startsWith("http://");
        System.out.println("b = " + b);
    }
}
