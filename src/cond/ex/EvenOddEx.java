package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 237;

        String answer = x % 2 == 0 ? "짝수" : "홀수";
        System.out.println("x : " + x);
        System.out.println("출력: x = " + x + ", " + answer);
    }
}
