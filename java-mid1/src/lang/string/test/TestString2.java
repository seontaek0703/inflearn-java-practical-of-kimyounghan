package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // TODO: length()를 사용하여 arr 배열에 들어있는 모든 문자열의 길이 합을 구하라.

        int sum = 0;
        for (String string : arr) {
            sum += string.length();
            System.out.println(string + ": " + string.length());
        }
        System.out.println("sum = " + sum);
    }
}
