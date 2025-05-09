package extends1.overriding;

public class ElectricCar extends Car {

    @Override // 생략이 가능하나 오버라이드 할 메서드명이 불일치하면 컴파일 에러를 잡아주지 않음.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}
