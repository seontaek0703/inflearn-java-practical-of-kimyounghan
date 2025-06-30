package nested.test;

public class OuterClass1 {
    // 정적 중첩 클래스

    // 여기에 NestedClass를 구현하고 hello() 메서드 생성
    static class NestedClass {

        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}


