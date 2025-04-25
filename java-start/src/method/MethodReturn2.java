package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
//        checkAge(25);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자는 출입이 불가합니다.");
            return;
        }
        System.out.println("입장하세요");
    }
}
