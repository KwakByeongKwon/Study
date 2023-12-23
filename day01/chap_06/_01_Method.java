package chap_06;

public class _01_Method {
    public static void sayHello(){
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        // 메소드 어떤 기능을하는 코드드들의 묶음
        // 파이썬에서는 함수라고 불림
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
