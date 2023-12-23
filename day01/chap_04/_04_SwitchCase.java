package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 조건)
        int ranking = 2; // 등수
        if (ranking == 1){
            System.out.println(ranking + "등 : 전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println(ranking + "등 : 반액 장학금");
        } else {
            System.out.println(ranking + "등 : 장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println(ranking + "등 : 전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println(ranking + "등 : 반액 장학금");
                break;
            default:
                System.out.println(ranking + "등 : 장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
    }
}
