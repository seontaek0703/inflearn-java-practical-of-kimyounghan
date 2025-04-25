package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("입력받을 숫자의 갯수를 입력하세요: ");
        int input = sc.nextInt();

        System.out.println(input + "개의 정수를 입력하세요.");
        int[] numbers = new int[input];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        double average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
