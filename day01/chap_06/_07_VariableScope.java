package chap_06;

public class _07_VariableScope {
    public static void methodA(){
//        System.out.println(number); // 에러 main 메서드의 지역변수임
//        System.out.println(result); // 에러 methodB 메서드의 지역변수임
    }
    public static void methodB(){
        int result = 1; // 지역변수
//        System.out.println(number); // 에러 main 메서드의 지역변수임
    }

    public static void main(String[] args) {
        int number = 3;
//        System.out.println(result); // 에러 methodA 메서드의 지역변수임

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i); for문도 i문 안에서만 사용가능 대가로를 벗어나면 사용 불가

    }
}

// 지역변수 변수가 선언된 위치에서만 사용 가능함
// {} 안에 서 사용된 변수는 그 속에서만 사용가능