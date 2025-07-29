package collection.list.test.ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int i = sc.nextInt();
            list.add(i);

            if (i == 0) {
                System.out.println("출력");
                for (int j = 0; j < list.size() - 1; j++) {
                    System.out.print(list.get(j));
                }
            }
        }
    }
}
