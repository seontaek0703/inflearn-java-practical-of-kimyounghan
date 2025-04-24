package method;

public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println(sum1);

        int sum2 = add(10, 15);
        System.out.println(sum2);
    }

    public static int add (int a, int b) {
        System.out.println(a + " + " + b + " 실행");
        int sum = a+b;
        return sum;
    }
}
