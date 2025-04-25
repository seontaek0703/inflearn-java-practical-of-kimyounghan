package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] students = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i] + ", 나이: " + studentAges[i] + ", 성적: " + studentGrades[i]);
        }
    }
}
