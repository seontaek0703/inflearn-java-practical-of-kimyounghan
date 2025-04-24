package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printing(3);
        printing(5);
        printing(7);
    }

    public static void printing(int i) {
        String message = "Hello, world!";

        for (int j = 0; j < i; j++) {
            System.out.println(message);
        }
    }
}
