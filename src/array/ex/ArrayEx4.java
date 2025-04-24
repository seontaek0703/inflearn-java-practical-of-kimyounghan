package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("5개의 정수를 입력하세요.");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            total += array[i];
        }
        double average = (double) total / array.length;
        System.out.println(array.length);
        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
