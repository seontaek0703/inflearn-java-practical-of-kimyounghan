package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수 입력: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("첫 번째 정수 " + num1 +"이(가) 두 번째 정수 " + num2 + "보다 더 큽니다.");
        } else if (num1 < num2) {
            System.out.println("두 번째 정수 " + num1 +"이(가) 첫 번째 정수 " + num2 + "보다 더 큽니다.");
        } else {
            System.out.println("두 정수가 동일한 값을 가집니다");
        }
    }
}
