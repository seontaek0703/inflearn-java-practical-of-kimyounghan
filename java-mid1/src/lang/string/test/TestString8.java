package lang.string.test;

public class TestString8 {

    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        // TODO replace()를 사용해 java라는 단어를 jvm으로 변경.

        String replace = input.replace("java", "jvm");
        System.out.println("replace = " + replace);
    }
}
