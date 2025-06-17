package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
//        printAuthGrade(AuthGrade.GUEST);
//        printAuthGrade(AuthGrade.LOGIN);
//        printAuthGrade(AuthGrade.ADMIN);
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("guest=" + value.name() + ", level=" + value.getLevel() + ", 설명=" + value.getDescription());
        }
    }

//    private static void printAuthGrade(AuthGrade grade) {
//        System.out.println("guest=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
//    }
}
