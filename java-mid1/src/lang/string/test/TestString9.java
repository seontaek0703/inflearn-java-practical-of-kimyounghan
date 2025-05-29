package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        // TODO split()을 사용해 이메일의 ID 부분과 도메인 부분을 분리
        String[] parts = email.split("@");
        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("idPart = " + idPart);
        System.out.println("domainPart = " + domainPart);

    }
    
}
