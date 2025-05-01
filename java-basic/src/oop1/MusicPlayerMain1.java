package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
<<<<<<< HEAD
        int volumn = 0;
=======
        int volume = 0;
>>>>>>> basic
        boolean isOn = false;

//        음악 재생
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

//        볼륨 증가
<<<<<<< HEAD
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);

//        볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨: " + volumn);

//        볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 감소: " + volumn);
=======
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

//        볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

//        볼륨 감소
        volume--;
        System.out.println("음악 플레이어 감소: " + volume);
>>>>>>> basic

//        음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
<<<<<<< HEAD
            System.out.println("음악 플레이어 On, 현재 볼륨: " + volumn);
        } else {
            System.out.println("음악 플레이어 Off");
        }
=======
            System.out.println("음악 플레이어 On, 현재 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }

//        음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
>>>>>>> basic
    }
}
