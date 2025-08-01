package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> students = new ArrayList<>();

        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }

        double average = (double) total / students.size();

        long end = System.currentTimeMillis();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 총합: " + average);
        System.out.println("time = " + (end - start) + "ms");
    }

}
