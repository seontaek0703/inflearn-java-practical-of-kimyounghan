package nested.test;

public class OuterClass2Main {
    // 내부 클래스

    public static void main(String[] args) {
        // 여기에 InnerClass의 hello() 메서드 호출
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
