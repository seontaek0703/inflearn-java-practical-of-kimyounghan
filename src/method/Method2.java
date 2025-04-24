package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooteR();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
        return;
    }

    public static void printFooteR() {
        System.out.println("= 프로그램을 종료합니다. =");
        return;
    }
}
