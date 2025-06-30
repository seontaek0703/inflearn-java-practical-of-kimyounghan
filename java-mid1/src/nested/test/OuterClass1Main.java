package nested.test;

public class OuterClass1Main {
    // 정적 중첩 클래스

    public static void main(String[] args) {
        // 여기에 NestedClass의 hello() 호출
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
