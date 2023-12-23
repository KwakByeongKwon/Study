package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; // 주차 시간
        boolean isSamllCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000원 곱하기)

        // 30000원 초과시 일일 최대 요금으로 수정

        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSamllCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }
        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
