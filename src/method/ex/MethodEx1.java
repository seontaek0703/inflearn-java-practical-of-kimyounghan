package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));

        System.out.println("평균값: " + average(15, 25, 35));
    }

    public static double average(int x, int y, int z) {
        return (double) (x + y + z) / 3;
    }
}
