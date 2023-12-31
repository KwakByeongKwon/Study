package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오후 3시

        if (hour < 14) {
            System.out.println("아이스 아메라키노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");

        System.out.println("-------------------------------------");
        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        System.out.println("-------------------------------------");
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");

        System.out.println("-------------------------------------");
    }
}
