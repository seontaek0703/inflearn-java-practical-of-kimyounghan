package cond.ex;

public class DistanceEx {

    public static void main(String[] args) {
        int distance = 230948 ;

        String transfer;

        if (distance <= 1) {
            transfer = "도보";
        } else if (distance <= 10) {
            transfer = "자전거";
        } else if (distance <= 100) {
            transfer = "자동차";
        } else {
            transfer = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println("출력: " + transfer + "를 이용하세요.");
    }
}
