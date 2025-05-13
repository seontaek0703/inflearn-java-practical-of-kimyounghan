package access.ex;

public class MaxCounter {
    // 내부에서 사용하고자 하는 숫자
    private int count = 0;

    // 최대값, 생성자를 통해 입력됨
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    // 숫자 하나를 증가하는 메서드
    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다");
            return;
        }
        // 실행 로직
        count++;
    }

    // 지금까지 증가한 값을 반환하는 메서드
    public int getCount() {
        return count;
    }
}
