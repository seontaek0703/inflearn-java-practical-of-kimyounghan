package lang.immutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MainObj obj = new MainObj(10);
        obj.add(20);

        // 계산 이후의 계산 값은 사라짐
        System.out.println("obj = " + obj.getValue());
    }
}
