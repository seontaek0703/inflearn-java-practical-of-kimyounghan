package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        // TODO str 문자열을 반대로 뒤집어라, reverse() 사용

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("reverse = " + reverse);
    }

}
