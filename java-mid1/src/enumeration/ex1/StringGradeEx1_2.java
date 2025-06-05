package enumeration.ex1;

public class StringGradeEx1_2 {

    // StringGrade를 사용하세요.
    public static void main(String[] args) {
        int price = 10_000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);

        System.out.println("VIP 등급의 할인 금액 = " + vip);
        
        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("diamondd = " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);

    }
}
