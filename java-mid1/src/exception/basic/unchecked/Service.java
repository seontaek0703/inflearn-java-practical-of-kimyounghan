package exception.basic.unchecked;

// Unchecked 예외는 잡거나 던지지 않아도 됨. 잡지 않을 경우 자동으로 밖으로 던짐.

public class Service {

    Client client = new Client();

    // 필요한 경우 예외를 잡아 처리할 수 있음
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 로직");
    }

    // 예외를 잡지 않아도 됨. 항상 상위로 넘어감.
    public void callThrow() {
        client.call();
    }
}
