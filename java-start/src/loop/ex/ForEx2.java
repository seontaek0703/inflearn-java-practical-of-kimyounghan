package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
//        int num = 2;
//
//        for (int count = 1; count <= 10; count++) {
//            System.out.println(num * count);
//        }
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
