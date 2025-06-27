package nested.test;

public class AnonymousClass {
    public static void main(String[] args) {
        // 여기서 Hello 익명 클래스 생성, hello 호출
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}
