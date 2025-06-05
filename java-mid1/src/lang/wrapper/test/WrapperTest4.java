package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        // TODO Auto boxing, unboxing
        // String -> Integer(타입이 일치하지 않아 오토 언박싱 자체가 불가능)
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int(객체 Integer에서 기본형 int로 오토 언박싱)
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        // int -> Integer(기본형 int에서 객체 Integer로 오토 박싱)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}
