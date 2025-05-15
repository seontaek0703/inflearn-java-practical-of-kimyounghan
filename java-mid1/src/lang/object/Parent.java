package lang.object;

// 별개의 상위 클래스가 명시되어 있지 않으면 묵시적으로 Object 클래스를 상속 받는다
public class Parent /* extends Object */{

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
