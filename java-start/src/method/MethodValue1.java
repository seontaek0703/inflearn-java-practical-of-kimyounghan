package method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1: " + num1);
        changeNumber(num1);
        System.out.println("4: " + num1);
    }

    public static void changeNumber(int num2) {
        System.out.println("2: " + num2);
        num2 = num2 * 2;
        System.out.println("3: " + num2);
    }
}
