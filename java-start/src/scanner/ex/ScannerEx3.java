package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String menu = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int price = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int amount = scanner.nextInt();

        int total = price * amount;

        System.out.println(menu + " " + amount + "개를 주문하셨습니다. 총 가격은 " + total + "원입니다.");
    }
}
