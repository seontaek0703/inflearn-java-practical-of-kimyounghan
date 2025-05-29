package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // TODO str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 indexOf()를 사용하여 출력하라.(반복문 사용)
        int count = 0;
        while (true) {
            int i = str.indexOf(key);
            System.out.println("i = " + i);
            if (str.indexOf(key) == -1) {
                break;
            }
            str = str.substring(i + key.length());
            count++;
        }
        System.out.println("count = " + count);
    }
}
