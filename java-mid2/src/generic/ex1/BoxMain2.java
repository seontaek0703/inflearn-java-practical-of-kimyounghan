package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println("stringBox = " + stringBox);

        // 잘못된 타입의 인수 전달
        integerBox.set("문자100");
        // Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
    }
}
