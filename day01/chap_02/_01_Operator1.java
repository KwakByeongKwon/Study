package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(4 % 2); // 0

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println(2 + 2 / 2); // 3
        System.out.println(2 + 2 % 2); // 2
        System.out.println((2 + 2) * 2); // 8

        System.out.println("------------------");
        int a = 20;
        int b = 10;
        int c ;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        c = b / a;
        System.out.println(c);

        System.out.println("------------------");

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val++); // 11
        System.out.println(val); // 12
        System.out.println("------------------");

        // 은행 대기번호 표
        int waiting = 0;
        System.out.printf("대기 인원 :%2d",waiting);
        System.out.println();
        waiting++;
        System.out.printf("대기 인원 : %d",val);

    }
}
