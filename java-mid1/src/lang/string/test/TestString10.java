package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // TODO split()과 join()을 사용해 다시 조합할 것

        String[] splitFruits = fruits.split(",");
        for (String splitFruit : splitFruits) {
            System.out.println(splitFruit);
        }

        String joinString = String.join("->", splitFruits);
        System.out.println("joinString = " + joinString);
    }
}
