package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volumn = 0;
        boolean isOn = false;

//        음악 재생
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

//        볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);

//        볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);

//        볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 감소: " + volumn);

//        음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 On, 현재 볼륨: " + volumn);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
